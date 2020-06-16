package org.example.write.demo2;

import com.alibaba.excel.EasyExcel;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/6/17 0:31
 */
public class Demo2 {

	public static <T> void write(List<T> data, OutputStream outputStream) throws IOException {
		EasyExcel.write(outputStream,data.get(0).getClass()).sheet("模拟").doWrite(data);
	}
	public static <T> void write(List<T> data, String fileName,String template) throws IOException {
//		EasyExcel.write(fileName,data.get(0).getClass()).sheet("模拟").doWrite(data);
//		模板写入
		EasyExcel.write(fileName,data.get(0).getClass())
//				.withTemplate(template)
				.sheet()
				.head(head())
//				.registerWriteHandler(new MergeHandle())
//				.registerWriteHandler(headStrage())
				.registerWriteHandler(new HeadHandle())
				.doWrite(data);
//		写入指定的列
//		EasyExcel.write(fileName,data.get(0).getClass()).includeColumnFiledNames(Arrays.asList("name","address")).sheet("模拟").doWrite(data);
	}

	public static List<List<String>> head(){
		return Arrays.asList(Arrays.asList("姓名"));
	}

	public static List<WriteData> getData(){
		return Arrays.asList(
				new WriteData(),new WriteData(),new WriteData(),
				new WriteData("1","噢噢","澳门","10","3"),
				new WriteData("1","噢噢","澳门","10","3"),
				new WriteData("1","小明","天津","23","2"),
				new WriteData("1","小王","四川","25","4")

		);
	}


}
