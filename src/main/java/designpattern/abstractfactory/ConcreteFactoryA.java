package designpattern.abstractfactory;

/**
 * @author wangrz 
 * 具体工厂：返回 1 系类产品的创建方法
 */
public class ConcreteFactoryA implements AbstractFactory {

	@Override
	public ProductA createProductA() {
		return new ProductA1();
	}

	@Override
	public ProductB createProductB() {
		return new ProductB1();
	}

}
