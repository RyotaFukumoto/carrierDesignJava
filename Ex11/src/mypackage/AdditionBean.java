package mypackage;

import java.io.Serializable;

public class AdditionBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private int value1;
	private int value2;
	private int ans;


	public AdditionBean() {

	}

	public void setValue1(int value1) {

		this.value1 = value1;

	}

	public int getValue1() {

		return this.value1;

	}

	public void setValue2(int value2) {

		this.value2 = value2;

	}

	public int getValue2() {

		return this.value2;

	}

	public int getAns() {

		return this.ans;

	}

	public void additionExecution() {

		this.ans = this.value1 + this.value2;

	}
}