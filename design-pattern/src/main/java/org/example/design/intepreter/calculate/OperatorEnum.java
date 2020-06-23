package org.example.design.intepreter.calculate;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/5/4 14:25
 */
public enum OperatorEnum {

	LEFT_BRACKET("("),
	RIGHT_BRACKET(")"),
	ADD("+"),
	SUB("-"),
	MULTI("*"),
	DIV("/");

	private String operator;

	OperatorEnum(String operator) {
		this.operator = operator;
	}

	public String getOperator() {
		return operator;
	}
}
