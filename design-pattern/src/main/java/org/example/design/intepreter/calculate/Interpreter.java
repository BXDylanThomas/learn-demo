package org.example.design.intepreter.calculate;


/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/5/4 14:35
 */
public abstract class Interpreter  implements ArithInterpreter {

	protected ArithInterpreter left;
	protected ArithInterpreter right;

	public Interpreter(ArithInterpreter left, ArithInterpreter right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public int interpret() {
		return 0;
	}
}
