package designpattern.abstractfactory;

/**
 * @author wangrz 
 * ProductB的 1 实现
 */
public class ProductB1 extends ProductB {

	@Override
	public void showB() {
		System.out.println(this.getClass().getSimpleName());
	}

}