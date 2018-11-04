package designpattern.proxy;

import java.util.ArrayList;

/**
 * @author wangrz
 * 虚拟代理对象
 * 将任务添加到一个列表中，先不创建真实对象
 * 达到某个条件或者手动创建的时候创建真实对象处理任务
 */
public class VirturalProxy implements VirturalSubject{
	
	private ArrayList<String> list;
	private VirturalRealSubject realSubject;
	
	public VirturalProxy() {
		this.list = new ArrayList<>();
	}
	
	@Override
	public void add(String s) {
		if (realSubject == null) {
			System.out.println("proxy 添加任务");
			this.list.add(s);
		}else {
			System.out.println("real 添加任务");
			realSubject.add(s);
		}
	}

	@Override
	public void approve() {
		if (realSubject == null) {
			realSubject = new VirturalRealSubject(list);
		}
		realSubject.approve();
	}
	
	

}
