package designpattern.abstractfactory;

/**
 * @author wangrz 
 * 抽象工厂：包含所有产品的创建的抽象方法
 */
public interface AbstractFactory {

	ProductA createProductA();

	ProductB createProductB();

}
