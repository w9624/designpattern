package designpattern.singleton;

/**
 * @author wangrz
 * 懒汉模式：懒加载，多线程不安全
 */
public class SingletonOne {
	
	private static SingletonOne instance;
	
	private SingletonOne() {
	}
	
	public static SingletonOne getInstance() {
		if (instance == null) {
			instance = new SingletonOne();
		}
		return instance;
	}

}
