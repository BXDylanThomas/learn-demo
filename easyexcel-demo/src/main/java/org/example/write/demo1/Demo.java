package org.example.write.demo1;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/6/17 0:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Demo{
	@ExcelProperty("班级")
	private String clazz;
	@ExcelProperty("姓名")
	private String name;
	@ExcelProperty("学科")
	private String subject;
	@ExcelProperty("选择")
	private int select;
	@ExcelProperty("阅读")
	private int read;
	@ExcelProperty("应用")
	private int use;
	@ExcelProperty("总分")
	private int total;

	public Demo(String clazz, String name, String subject, int select, int read, int use) {
		this.clazz = clazz;
		this.name = name;
		this.subject = subject;
		this.select = select;
		this.read = read;
		this.use = use;
	}
}
