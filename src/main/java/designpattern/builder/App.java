package designpattern.builder;

public class App {

	public static void main(String[] args) {
		// 创建指挥者
		Director director = new Director();
		// 创建需要对应对象的建造器
		ConcreteBuilderA ca = new ConcreteBuilderA();
		ConcreteBuilderB cb = new ConcreteBuilderB();
		// 指挥者指挥建造
		director.Construct(ca);
		director.Construct(cb);
		// 获取结果
		Product pa = ca.getProduct();
		Product pb = cb.getProduct();
		// 显示，同样的过程Product对象的不同表示
		pa.show();
		pb.show();
	}

}
