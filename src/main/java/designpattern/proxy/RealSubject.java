package designpattern.proxy;

/**
 * @author wangrz
 * 被代理的真实对象
 */
public class RealSubject implements Subject{

	@Override
	public void show() {
		System.out.println("I am real Subject !!!");
	}

}
