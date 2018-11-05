package designpattern.abstractfactory;

public class App {

	public static void main(String[] args) {

		ProductA pA = null;
		ProductB pB = null;
		// 抽象工厂
		System.out.println("————————————抽象工厂————————————");
		// 创建产品系类1
		System.out.println("产品系类1: ");
		AbstractFactory cf = new ConcreteFactoryA();
		// AbstractFactory cf = new ConcreteFactoryB(); //切换到 2 系列
		pA = cf.createProductA();
		pB = cf.createProductB();
		pA.showA();
		pB.showB();

		// 简单工厂
		System.out.println("————————————简单工厂————————————");
		// 创建产品系列 1 即type=1，切换到 2 系列将type=2
		System.out.println("产品系类1: ");
		pA = AfSimpleFacotry.createProductA();
		pB = AfSimpleFacotry.createProductB();
		pA.showA();
		pB.showB();

		// 简单工厂+反射
		System.out.println("————————————简单工厂+反射————————————");
		// 创建产品系列 1 即type=1，切换到 2 系列将type=2
		System.out.println("产品系类1: ");
		pA = AfSfReflect.createProductA();
		pB = AfSfReflect.createProductB();
		pA.showA();
		pB.showB();
	}

}
