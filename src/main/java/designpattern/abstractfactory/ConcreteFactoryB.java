package designpattern.abstractfactory;

/**
 * @author wangrz 
 * 具体工厂：返回 2 系类产品的创建方法
 */
public class ConcreteFactoryB implements AbstractFactory {

	@Override
	public ProductA createProductA() {
		return new ProductA2();
	}

	@Override
	public ProductB createProductB() {
		return new ProductB2();
	}

}
