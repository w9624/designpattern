package designpattern.proxy;

/**
 * @author wangrz
 * cglib代理的真实对象，不需要实现任何接口
 */
public class CglibRealSubject {

	public void show() {
		System.out.println("I an cglib real subject !!!");
	}
}
