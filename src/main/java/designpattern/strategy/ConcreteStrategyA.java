package designpattern.strategy;

public class ConcreteStrategyA implements Strategy{
	
	public ConcreteStrategyA() {
	}

	@Override
	public void algorithm() {
		System.out.println("I am ConcreteStrategyA!");
	}

}
