package designpattern.decorator;

/**
 * @author wangrz
 * 装饰器A，给对象添加状态
 */
public class ConcreteDecoratorA extends Decorator {
	
	private String state;

	@Override
	public void operate() {
		super.operate();
		this.state = "Add State";
		System.out.println("DecoratorA: " + state);
	}

}
