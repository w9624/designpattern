package designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author wangrz
 * 动态代理对象，实现InvocationHandler接口，覆盖invoke方法
 */
public class DynamicProxy implements InvocationHandler{
	
	private Object object;
	
	public DynamicProxy(Object object) {
		this.object = object;
	}

	//参数分别为：代理的真实对象，代理的真实对象的某个方法的method对象，方法参数
	@Override public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("dynamic before real...");
		//代理的真实对象和参数
		method.invoke(object, args);
		System.out.println("dynamic after real...");
		return null;
	}

}
