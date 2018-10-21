package designpattern.strategy;

public class Context {
	
	Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public double getResult(double money) {
		return strategy.getResult(money);
	}

}
