package designpattern.bridge;

public class ConcreteAbstractionB extends Abstraction {

	@Override
	protected void operation() {
		implementor.operation();
	}
	
}
