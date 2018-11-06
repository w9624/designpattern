package designpattern.adapter;

/**
 * @author wangrz
 * 可是使用这样的过程，有选择的实现接口中的方法
 */
public class InConcreteClass extends InAbstractClass {

	@Override
	public void show() {
		System.out.println("I am Interface Adapter");
	}

}
