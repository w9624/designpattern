package designpattern.bridge;

public class ConcreteImplementorB implements Implementor{

	@Override
	public void operation() {
		System.out.println("I am ConcreteImplementorB !");
	}

}
