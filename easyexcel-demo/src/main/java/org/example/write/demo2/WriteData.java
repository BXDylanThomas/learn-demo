package org.example.write.demo2;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/6/16 19:02
 */
@Data@AllArgsConstructor@NoArgsConstructor
public class WriteData {

	@ExcelProperty("序号")
	private String id ;

	@ExcelProperty("姓名")
	private String name;

	@ExcelProperty("地址")
	private String address;

	@ExcelProperty("年龄")
	private String age;

	@ExcelProperty("年级")
	private String grade;
}
