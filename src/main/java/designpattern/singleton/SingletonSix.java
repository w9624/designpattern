package designpattern.singleton;

/**
 * @author wangrz
 * 枚举模式：非懒加载，多线程安全
 * 自动支持序列化机制，绝对防止多次实例化
 * 不能通过 reflection attack 来调用私有构造方法
 */
public enum SingletonSix {
	
	INSTANCE;
	
	public static SingletonSix getInstance() {
		return SingletonSix.INSTANCE;
	}

}
