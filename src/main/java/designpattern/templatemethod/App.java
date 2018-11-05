package designpattern.templatemethod;

public class App {

	public static void main(String[] args) {
		//创建两个实现类
		AbstractClass ca = new ConcreteClassA();
		AbstractClass cb = new ConcreteClassB();
		//run方法不同实现
		ca.run();
		cb.run();
		//公共方法 show
		ca.show();
		cb.show();
 	}

}
