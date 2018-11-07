package designpattern.singleton;

import java.io.Serializable;

/**
 * @author wangrz
 * 懒汉 双重锁模式：懒加载，多线程安全
 * 在多线程情况下能保持高性能
 * 对其序列化，进行序列化攻击
 */
public class SingletonThree implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private static SingletonThree instance;

	private SingletonThree() {
	}

	public static SingletonThree getInstance() {
		//判断实例是否存在
		if (instance == null) {
			//如果实例不存在，存在多个线程同时持有锁
			synchronized (SingletonThree.class) {
				//如果多个线程持有锁，保证初始化一次
				if (instance == null) {
					instance = new SingletonThree();
				}
			}
		}
		return instance;
	}

}
