package designpattern.adapter;

/**
 * @author wangrz 
 * 需要被适配的类
 */
public class Adaptee {

	public void specificRequest() {
		System.out.println("This is " + this.getClass().getSimpleName());
	}

}
