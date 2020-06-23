package org.example.design.intepreter.calculate;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/5/4 15:04
 */

public class NumInterpreter implements ArithInterpreter {
	private int value;

	public NumInterpreter(int value) {
		this.value = value;
	}

	@Override
	public int interpret() {
		return this.value;
	}
}
