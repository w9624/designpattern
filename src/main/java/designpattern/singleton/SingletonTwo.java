package designpattern.singleton;

/**
 * @author wangrz
 * 懒汉模式：懒加载，多线程安全
 * 由于每次无论单例是否存在都加锁，效率低下
 */
public class SingletonTwo {
	
	private static SingletonTwo instance;

	private SingletonTwo() {
		//防止反射攻击，当进入构造方法的时候进行判断
		synchronized (SingletonTwo.class) {
			if (instance != null) {
				throw new RuntimeException("单例模式被攻击！");
			}
		}
	}

	public static synchronized SingletonTwo getInstance() {
		if (instance == null) {
			instance = new SingletonTwo();
		}
		return instance;
	}

}
