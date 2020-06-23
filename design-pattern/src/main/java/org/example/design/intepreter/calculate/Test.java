package org.example.design.intepreter.calculate;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/5/4 15:05
 */
public class Test {
	public static void main(String[] args) {

		System.out.println("result: " + new AdvanceCalculater("10+(30/2+(2-1))").getResult());
	}
}
