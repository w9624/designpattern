package designpattern.bridge;

public class ConcreteImplementorA implements Implementor{

	@Override
	public void operation() {
		System.out.println("I am ConcreteImplementorA !");
	}

}
