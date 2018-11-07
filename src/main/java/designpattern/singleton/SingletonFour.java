package designpattern.singleton;

import java.io.Serializable;

/**
 * @author wangrz 
 * 饿汉模式：非懒加载，多线程安全 
 * 优点：没有加锁，执行效率会提高。 
 * 缺点：类加载时就初始化，浪费内存。
 */
public class SingletonFour implements Serializable {

	private static final long serialVersionUID = 1L;

	private static SingletonFour instance = new SingletonFour();

	private SingletonFour() {
	}

	public static SingletonFour getInstance() {
		return instance;
	}

	//重写readResolve，方法，防止序列化攻击
	private Object readResolve() {
		return instance;
	}
}
