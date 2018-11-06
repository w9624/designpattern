package designpattern.adapter;

/**
 * @author wangrz 
 * 类适配器：实现Target，继承Adaptee
 */
public class ClassAdapter extends Adaptee implements ClassTarget {

	@Override
	public void request() {
		this.specificRequest();
	}

}
