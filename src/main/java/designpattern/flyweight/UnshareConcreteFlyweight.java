package designpattern.flyweight;

/**
 * @author wangrz
 * 不可共享对象
 */
public class UnshareConcreteFlyweight implements Flyweight {
	
	private String name;
	
	public UnshareConcreteFlyweight(String name) {
		this.name = name;
	}

	@Override
	public void operate(String user) {
		System.out.println("I am UnshareConcreteFlyweight: " + name + this.hashCode());
		System.out.println("User is: " + user);
	}

}