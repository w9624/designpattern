package designpattern.flyweight;

import java.util.HashMap;

/**
 * @author wangrz
 * 享元工厂，使用单例模式实现
 */
public class FlyweightFactory {
	
	private HashMap<String, Flyweight> flywieghts = new HashMap<>();
	
	private static FlyweightFactory instance = new FlyweightFactory();
	
	private FlyweightFactory() {}
	
	public static FlyweightFactory getInstance() {
		return instance;
	}
	
	public Flyweight getFlyweight(String key) {
		if (!flywieghts.containsKey(key)) {
			flywieghts.put(key, (Flyweight) new ConcreteFlyweight(key));
		}
		return flywieghts.get(key);
	}
	
	public Flyweight getCompositeFlyweight(String key) {
		if (!flywieghts.containsKey(key)) {
			flywieghts.put(key, (Flyweight) new CompositeFlyweight(key));
		}
		return flywieghts.get(key);
	}
	
	public int count() {
		return flywieghts.size();
	}

}
