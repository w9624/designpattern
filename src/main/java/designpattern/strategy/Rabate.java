package designpattern.strategy;

public class Rabate implements Strategy{
	
	private double rabate;
	
	public Rabate(double rabate) {
		this.rabate = rabate;
	}

	@Override
	public double getResult(double money) {
		return money * rabate;
	}

}
