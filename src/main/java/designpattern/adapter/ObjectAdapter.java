package designpattern.adapter;

/**
 * @author wangrz 
 * 对象适配器：继承/实现Target，持有Adaptee
 */
public class ObjectAdapter extends ObjectTarget {

	private Adaptee adapter = new Adaptee();

	@Override
	public void request() {
		adapter.specificRequest();
	}

}
