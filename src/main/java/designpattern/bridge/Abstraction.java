package designpattern.bridge;

public abstract class Abstraction {
	
	//聚集Implementor
	protected Implementor implementor;

	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}

	protected abstract void operation();
	
	public void show() {
		System.out.println("I am " + this.getClass().getSimpleName());
	}
	
}
