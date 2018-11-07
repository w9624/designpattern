package designpattern.bridge;

public class App {

	public static void main(String[] args) {
		//创建抽象类，可以看作时手机
		Abstraction ca = new ConcreteAbstractionA();
		Abstraction cb = new ConcreteAbstractionB();
		//创建操作，看作手机上运行的游戏
		Implementor ia = new ConcreteImplementorA();
		Implementor ib = new ConcreteImplementorB();
		//向抽象部分注入实现，手机运行游戏
		ca.show();
		ca.setImplementor(ia);
		ca.operation();
		ca.setImplementor(ib);
		ca.operation();
		System.out.println();
		cb.show();
		cb.setImplementor(ia);
		cb.operation();
		cb.setImplementor(ib);
		cb.operation();
	}

}
