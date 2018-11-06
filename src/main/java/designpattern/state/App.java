package designpattern.state;

public class App {

	public static void main(String[] args) {
		//初始化Context的状态为ConcreteStateA
		Context context = new Context(new ConcreteStateA());
		//切换状态
		context.request();
		context.request();
		context.request();

	}

}
