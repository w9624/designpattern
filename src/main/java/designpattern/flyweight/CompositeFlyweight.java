package designpattern.flyweight;

/**
 * @author wangrz
 * 组合共享对象
 */
import java.util.ArrayList;

public class CompositeFlyweight implements Flyweight {
	
	private String name;
	private ArrayList<Flyweight> flyweights = new ArrayList<>();

	public CompositeFlyweight(String name) {
		this.name = name;
	}
	
	public void add(Flyweight flyweight) {
		flyweights.add(flyweight);
	}
	
	public void remove(Flyweight flyweight) {
		flyweights.remove(flyweight);
	}

	@Override
	public void operate(String user) {
		System.out.println("I am CompositeFlyweight: " + name + this.hashCode());
		System.out.println("User is: " + user);
		for (Flyweight flyweight : flyweights) {
			System.out.println(flyweight.hashCode());
		}
	}

}
