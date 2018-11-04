package designpattern.factorymethod;

public class ConcreteFactory implements Factory {

	@Override
	public Product create() {
		return new ConcreteProduct();
	}

}
