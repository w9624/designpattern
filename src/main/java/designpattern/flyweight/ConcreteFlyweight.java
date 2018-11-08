package designpattern.flyweight;

/**
 * @author wangrz
 * 可共享对象
 */
public class ConcreteFlyweight implements Flyweight {
	//内部状态
	private String name;
	
	public ConcreteFlyweight(String name) {
		this.name = name;
	}

	//传入外部状态
	@Override
	public void operate(String user) {
		System.out.println("I am ConcreteFlyweight: " + name + this.hashCode());
		System.out.println("User is: " + user);
	}

}
