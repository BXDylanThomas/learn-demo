package org.example.write.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/6/16 23:05
 */
public class DataModel {

	public static List<Demo> fromDb() {
		List<Demo> list = new ArrayList<>();
		list.add(new Demo("高一三班", "小明", "语文", 10, 20, 30));
		list.add(new Demo("高一三班", "小明", "数学", 10, 20, 30));
		list.add(new Demo("高一三班", "小爱", "语文", 10, 20, 30));
		list.add(new Demo("高一三班", "小爱", "数学", 10, 20, 30));
		list.add(new Demo("高一三班", "小金", "语文", 10, 20, 30));
		list.add(new Demo("高一三班", "小金", "数学", 10, 20, 30));

//		list.add(new Demo("高一五班", "小明", "语文", 20, 20, 40));
//		list.add(new Demo("高一五班", "小明", "数学", 20, 20, 40));
//		list.add(new Demo("高一五班", "小爱", "语文", 20, 20, 40));
//		list.add(new Demo("高一五班", "小爱", "数学", 20, 20, 40));
//		list.add(new Demo("高一五班", "小金", "语文", 20, 20, 40));
//		list.add(new Demo("高一五班", "小金", "数学", 20, 20, 40));
		return list;
	}

	public static List<List<String>> createHead(){
		String[] title = {"班级","姓名","学科","选择","阅读","应用","总分"};
		String mainTile = "班级分数表";
		List<List<String>> head = new ArrayList<>();
		for (String name : title) {
			List<String> titleList = new ArrayList<>();
			titleList.add(mainTile);
			titleList.add(name);
			head.add(titleList);
		}
		return head;
	}


}
