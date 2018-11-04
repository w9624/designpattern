package designpattern.decorator;

public class App {

	public static void main(String[] args) {
		//创建被装饰对象
		Component component = new ConcreteComponent();
		//装饰器
		Decorator da = new ConcreteDecoratorA();
		Decorator db = new ConcreteDecoratorB();
		//装饰
		da.setComponent(component);
		db.setComponent(da);
		//调用操作
		db.operate();
	}

}
