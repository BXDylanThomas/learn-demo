package org.example.design.intepreter.calculate;


import org.example.design.intepreter.calculate.inter.AddInterpreter;
import org.example.design.intepreter.calculate.inter.DivInterpreter;
import org.example.design.intepreter.calculate.inter.MultiInterpreter;
import org.example.design.intepreter.calculate.inter.SubInterpreter;

import java.util.Stack;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/5/4 14:30
 */
public class OperatorUtil {

	public static boolean isOperator(String symbol) {
		return "+".equals(symbol) || "-".equals(symbol) ||
				"*".equals(symbol) || "/".equals(symbol);
	}

	public static Interpreter getInterpreter(Stack<ArithInterpreter> numStack, Stack<String> operatorStack) {
		ArithInterpreter rightExpr = numStack.pop();
		ArithInterpreter leftExpr = numStack.pop();
		String symbol = operatorStack.pop();
		System.out.println("数字出栈："+rightExpr.interpret()+","+leftExpr.interpret()+",操作符出栈:"+symbol);
		if (symbol.equals("+")) {
			return new AddInterpreter(leftExpr, rightExpr);
		} else if (symbol.equals("-")) {
			return new SubInterpreter(leftExpr, rightExpr);
		} else if (symbol.equals("*")) {
			return new MultiInterpreter(leftExpr, rightExpr);
		} else if (symbol.equals("/")) {
			return new DivInterpreter(leftExpr, rightExpr);
		}
		return null;
	}


}
