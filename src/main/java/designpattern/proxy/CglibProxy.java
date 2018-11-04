package designpattern.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author wangrz
 * Cglib代理对象
 */
public class CglibProxy implements MethodInterceptor{
	
	private Object object;
	
	public CglibProxy(Object object) {
		this.object = object;
	}
	
	public Object getInstance() {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(object.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}

	@Override
	public Object intercept(Object arg0, Method method, Object[] arg2, MethodProxy arg3) throws Throwable {
		System.out.println("cglib before real...");
		method.invoke(object, arg2);
		System.out.println("cglib after real...");
		
		return null;
	}

}
