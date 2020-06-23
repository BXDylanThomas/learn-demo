package org.example.design.intepreter.calculate.inter;

import org.example.design.intepreter.calculate.ArithInterpreter;
import org.example.design.intepreter.calculate.Interpreter;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/5/4 14:40
 */
public class MultiInterpreter extends Interpreter {
	public MultiInterpreter(ArithInterpreter left, ArithInterpreter right) {
		super(left, right);
	}

	@Override
	public int interpret() {
		return this.left.interpret()*this.right.interpret();
	}
}
