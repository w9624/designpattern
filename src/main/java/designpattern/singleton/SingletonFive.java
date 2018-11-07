package designpattern.singleton;

/**
 * @author wangrz
 * 静态内部类模式：懒加载，多线程安全
 * 无需加锁
 */
public class SingletonFive {
	
	private static class SingletonHolder {
		private static final SingletonFive  INSTANCE = new SingletonFive();
	}
	
	private SingletonFive() {}
	
	public static SingletonFive getInstance() {
		return SingletonHolder.INSTANCE;
	}

}
