package designpattern.bridge;

public class ConcreteAbstractionA extends Abstraction {

	@Override
	protected void operation() {
		implementor.operation();
	}
	
}
