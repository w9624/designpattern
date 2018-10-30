package designpattern.bridge;

public class ConcreteAbstractionB extends Abstraction {

	public ConcreteAbstractionB(Implementor implementor) {
		super(implementor);
	}

	@Override
	protected void operation() {
		implementor.operation();
	}
	
}
