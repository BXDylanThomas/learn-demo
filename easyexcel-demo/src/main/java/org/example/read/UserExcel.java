package org.example.read;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ContentLoopMerge;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/6/16 14:30
 */
@Data@AllArgsConstructor@NoArgsConstructor
public class UserExcel {
	@ContentLoopMerge
	@ExcelProperty(index = 0)
	private String id ;

	@ExcelProperty(index = 1)
	private String name;

	@ExcelProperty(index = 2)
	private String address;

	@ExcelProperty(index = 3)
	private String age;

	@ExcelProperty(index = 4)
	private String grade;

}
