package designpattern.proxy;

import java.util.ArrayList;

/**
 * @author wangrz
 * 虚拟代理的真实对象
 */
public class VirturalRealSubject implements VirturalSubject{
	
	ArrayList<String> list;
	
	public VirturalRealSubject(ArrayList<String> list) {
		this.list = list;
	}

	@Override
	public void approve() {
		while (list.size() > 0) {
			System.out.println("real handle" + list.get(0));
			list.remove(0);
		}
	}

	@Override
	public void add(String s) {
		list.add(s);
	} 
	
	

}
