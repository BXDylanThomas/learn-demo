package org.example.write.demo1;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.write.metadata.style.WriteCellStyle;
import com.alibaba.excel.write.metadata.style.WriteFont;
import com.alibaba.excel.write.style.HorizontalCellStyleStrategy;
import com.alibaba.excel.write.style.row.SimpleRowHeightStyleStrategy;
import org.apache.poi.ss.usermodel.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/6/16 23:16
 */
public class WriteDemo {

	public static void main(String[] args) {
		String targetFile = "blog.xlsx";

		//拿到基础数据
		List<Demo> demos = DataModel.fromDb();
		List<List<String>> head = DataModel.createHead();

		// 第二列，即姓名，每个班级的人都一致
		List<String> nameList = demos.stream().map(Demo::getName).distinct().collect(Collectors.toList());
		// 第三列，即学科，每个班级的每个人的学科个数都一致
		List<String> subjectList = demos.stream().map(Demo::getSubject).distinct().collect(Collectors.toList());


		List<Demo> data = calSumData(demos);


		// 自定义合并策略，第一个参数是学科的数量+1，+1是为了把合计这一行也算上，
		DemoMergeStrategy mergeStrategy = new DemoMergeStrategy(subjectList.size() + 1, nameList.size());

		EasyExcel.write(targetFile, Demo.class)
				// 设置统一的表头、表内容样式
				.registerWriteHandler(style())
				// 设置表头，表内容的行高
				.registerWriteHandler(new SimpleRowHeightStyleStrategy((short) 50, (short) 20))
				// 指定这个sheet的每个列的宽度
				.registerWriteHandler(new DemoColumnWidthStrategy())
				.registerWriteHandler(mergeStrategy)
				// 自定义多级复杂表头
				.head(head)
				.sheet().doWrite(data);

	}

	public static List<List<Demo>> dealData(List<Demo> list) {
		List<List<Demo>> data = new ArrayList<>();
		list.forEach(d -> data.add(Collections.singletonList(d)));
		return data;
	}

	private static List<Demo> calSumData(List<Demo> list) {
		List<Demo> demoList = new ArrayList<>();
		Map<String, List<Demo>> nameMap = list.stream().collect(Collectors.groupingBy(Demo::getName));
		nameMap.forEach((name, subjects) -> {
			AtomicInteger temp = new AtomicInteger(0);
			subjects.forEach(d -> {
				int total = d.getSelect() + d.getRead() + d.getUse();
				d.setTotal(total);
				temp.addAndGet(total);
				demoList.add(d);
			});
			Demo total = new Demo();
			total.setSubject("合计：");
			total.setTotal(temp.get());
			demoList.add(total);
		});

		return demoList;
	}

	public static HorizontalCellStyleStrategy style() {
		// 头的样式
		WriteCellStyle headStyle = new WriteCellStyle();
		headStyle.setFillForegroundColor(IndexedColors.WHITE.getIndex());
		WriteFont headFont = new WriteFont();
		headFont.setBold(true);
		headFont.setFontHeightInPoints((short) 16);
		headStyle.setWriteFont(headFont);
		headStyle.setWrapped(true);

		// 内容的样式
		WriteCellStyle contentStyle = new WriteCellStyle();
		contentStyle.setFillPatternType(FillPatternType.SOLID_FOREGROUND);
		contentStyle.setFillForegroundColor(IndexedColors.WHITE.getIndex());
		WriteFont contentWriteFont = new WriteFont();
		contentWriteFont.setFontHeightInPoints((short) 12);
		contentStyle.setWriteFont(contentWriteFont);
		contentStyle.setBorderTop(BorderStyle.THIN);
		contentStyle.setBorderBottom(BorderStyle.THIN);
		contentStyle.setBorderLeft(BorderStyle.THIN);
		contentStyle.setBorderRight(BorderStyle.THIN);
		contentStyle.setHorizontalAlignment(HorizontalAlignment.CENTER);
		contentStyle.setVerticalAlignment(VerticalAlignment.CENTER);
		contentStyle.setWrapped(true);
		return new HorizontalCellStyleStrategy(headStyle, contentStyle);

	}
}
