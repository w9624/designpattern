package designpattern.bridge;

public class ConcreteAbstractionA extends Abstraction {

	public ConcreteAbstractionA(Implementor implementor) {
		super(implementor);
	}

	@Override
	protected void operation() {
		implementor.operation();
	}
	
}
