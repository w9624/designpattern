package designpattern.abstractfactory;

/**
 * @author wangrz 
 * 使用简单工厂：由关键字来决定，每个创建类都有switch语句
 */
public class AfSimpleFacotry {

	private static final int type = 1;

	// private static final int type = 2;
	public static ProductA createProductA() {
		ProductA pA = null;
		switch (type) {
		case 1:
			pA = new ProductA1();
			break;
		case 2:
			pA = new ProductA2();
			break;
		}
		return pA;
	}

	public static ProductB createProductB() {
		ProductB pB = null;
		switch (type) {
		case 1:
			pB = new ProductB1();
			break;
		case 2:
			pB = new ProductB2();
			break;
		}
		return pB;
	}

}
