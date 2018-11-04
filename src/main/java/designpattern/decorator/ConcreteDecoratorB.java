package designpattern.decorator;

/**
 * @author wangrz
 * 装饰器B，给对象添加操作
 */
public class ConcreteDecoratorB extends Decorator {

	@Override
	public void operate() {
		super.operate();
		otherOperate();
	}
	
	private void otherOperate() {
		System.out.println("Decorator B：add behaivor");
	}

}
