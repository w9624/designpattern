package designpattern.simplefactory;

/**
 * @author wangrz
 * 操作抽象类
 */
public abstract class Operation {
	
	protected double numA = 0;
	protected double numB = 0;
	
	public abstract double getResult();

}
