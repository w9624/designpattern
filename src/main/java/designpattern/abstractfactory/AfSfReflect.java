package designpattern.abstractfactory;

/**
 * @author wangrz 
 * 简单工厂+反射：去除switch语句
 */
public class AfSfReflect {

	private static final String pack = "designpattern.abstractfactory.";
	private static final String type = "1";

	public static ProductA createProductA() {
		ProductA pA = null;
		try {
			pA = (ProductA) Class.forName(pack+"ProductA"+type).newInstance();
		} catch (ClassNotFoundException | InstantiationException 
				| IllegalAccessException e) {
			e.printStackTrace();
		}
		return pA;
	}

	public static ProductB createProductB() {
		ProductB pB = null;
		try {
			pB = (ProductB) Class.forName(pack+"ProductB"+type).newInstance();
		} catch (ClassNotFoundException | InstantiationException 
				| IllegalAccessException e) {
			e.printStackTrace();
		}
		return pB;
	}

}