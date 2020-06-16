package org.example.write.demo1;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.style.column.AbstractHeadColumnWidthStyleStrategy;

/**
 * code is far away from bug with the animal protecting
 *
 * 列宽
 *
 * @Author : dylan
 * @Date :create in 2020/6/16 23:20
 */

public class DemoColumnWidthStrategy extends AbstractHeadColumnWidthStyleStrategy {

	@Override
	protected Integer columnWidth(Head head, Integer columnIndex) {
		switch (columnIndex) {
			case 0:
				// 班级
				return 20;
			case 1:
				// 姓名
				return 10;
			case 2:
				// 学科
				return 10;
			case 3:
				// 选择题
				return 10;
			case 4:
				// 阅读题
				return 10;
			case 5:
				// 应用题
				return 10;
			case 6:
				// 总分
				return 15;
			default:
				return 10;
		}
	}
}
