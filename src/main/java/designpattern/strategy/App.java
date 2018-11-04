package designpattern.strategy;

public class App {

	public static void main(String[] args) {
	// 获取context并确定策略
		Context context = new Context(new ConcreteStrategyA());
		context.algorithm();
		context = new Context(new ConcreteStrategyB());
		context.algorithm();
	}

}
