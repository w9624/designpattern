package designpattern.proxy;

/**
 * @author wangrz
 * 静态代理对象
 */
public class StaticProxy implements Subject {
	
	private RealSubject realSubject;

	@Override
	public void show() {
		if (realSubject == null) {
			this.realSubject = new RealSubject();
		}
		System.out.println("static before real...");
		realSubject.show();
		System.out.println("static after real...");
	}
	
	

}
