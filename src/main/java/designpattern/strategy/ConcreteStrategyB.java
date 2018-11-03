package designpattern.strategy;

public class ConcreteStrategyB implements Strategy{
	
	public ConcreteStrategyB() {
	}

	@Override
	public void algorithm() {
		System.out.println("I am ConcreteStrategyB!");
	}

}

