package org.example.read;

import com.alibaba.excel.EasyExcel;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/6/17 0:29
 */
public class ReadDemo {


	public static void main(String[] args) {
		read("C:\\Users\\Administrator\\Desktop\\新建 XLS 工作表.xls",new UserExcel());
		read("C:\\Users\\Administrator\\Desktop\\新建 XLS 工作表.xls",new HashMap<String,String>());

	}

	public static <T> List<T> read(String filePath, T data) {
		ModelExcelListener<T> modelExcelListener = new ModelExcelListener<>();
		if (data instanceof Map){
			EasyExcel.read(filePath,modelExcelListener).sheet().headRowNumber(0).doRead();
		}else{
			EasyExcel.read(filePath,data.getClass(),modelExcelListener).sheet().headRowNumber(0).doRead();
		}
		return modelExcelListener.getData();
	}

}
