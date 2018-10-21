package designpattern.strategy;

public class Normal implements Strategy{
	
	public Normal() {
	}

	@Override
	public double getResult(double money) {
		return money;
	}

}
