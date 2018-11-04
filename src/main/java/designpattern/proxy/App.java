package designpattern.proxy;

import java.lang.reflect.Proxy;

public class App {

	public static void main(String[] args) {
		
		//静态代理
		StaticProxy sp = new StaticProxy();
		sp.show();
		System.out.println();
		
		//动态代理
		Subject realSubject = new RealSubject();
		//为真实对象创建代理
		DynamicProxy dp = new DynamicProxy(realSubject);
		/* 创建代理对象,原因就是在newProxyInstance这个方法的第二个参数上，
		 * 我们给这个代理对象提供了一组什么接口，那么我这个代理对象就会实现了这组接口，
		 * 这个时候我们当然可以将这个代理对象强制类型转化为这组接口中的任意一个，
		 * 因为这里的接口是Subject类型，所以就可以将其转化为Subject类型了。
		 * 参数类型：
		 *   一个ClassLoader对象，定义了由哪个ClassLoader对象来对生成的代理对象进行加载
		 *   一个Interface对象的数组，表示的是我将要给我需要代理的对象提供一组什么接口，
		 * 如果我提供了一组接口给它，那么这个代理对象就宣称实现了该接口(多态)，
		 * 这样我就能调用这组接口中的方法了
		 *   一个InvocationHandler对象，表示的是当我这个动态代理对象在调用方法的时候，
		 * 会关联到哪一个InvocationHandler对象上
		*/
		Subject subject = (Subject) Proxy.newProxyInstance(dp.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), dp);
		subject.show();
		System.out.println();
		
		//cglib代理
		CglibRealSubject cp = (CglibRealSubject) new CglibProxy(new CglibRealSubject()).getInstance();
		cp.show();
		System.out.println();
		
		//虚拟代理
		System.out.println("———————————————虚拟代理———————————————");
		VirturalProxy vp = new VirturalProxy();
		vp.add("开会");
		vp.add("喝酒");
		vp.approve();
		vp.add("吃法");
		vp.add("下班");
		vp.approve();
	}

}
