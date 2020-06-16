package org.example.read;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/6/16 18:47
 */

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.ArrayList;
import java.util.List;

public class ModelExcelListener<T> extends AnalysisEventListener<T> {
	List<T> list = new ArrayList<>();

	@Override
	public void invoke(T data, AnalysisContext context) {
		list.add(data);
	}

	@Override
	public void doAfterAllAnalysed(AnalysisContext context) {}

	public List<T> getData(){return list;}

}
