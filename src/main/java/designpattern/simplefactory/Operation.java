package designpattern.simplefactory;

public abstract class Operation {
	
	//两个运算数
	protected int numA;
	protected int numB;
	//运算结果
	protected int result;
	//获取结果
	public abstract int getResult();

	public int getNumA() {
		return numA;
	}

	public void setNumA(int numA) {
		this.numA = numA;
	}

	public int getNumB() {
		return numB;
	}

	public void setNumB(int numB) {
		this.numB = numB;
	}

}
