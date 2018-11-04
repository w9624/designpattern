package designpattern.factorymethod;

public class App {

	public static void main(String[] args) {
		//客户端选择具体的工厂
		Factory factory = new ConcreteFactory();
		Product product = factory.create();
		product.show();
	}

}
