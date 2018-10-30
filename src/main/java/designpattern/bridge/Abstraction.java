package designpattern.bridge;

public abstract class Abstraction {
	
	//聚集Implementor
	protected Implementor implementor;

	public Abstraction(Implementor implementor) {
		this.implementor = implementor;
	}

	protected abstract void operation();
	
}
