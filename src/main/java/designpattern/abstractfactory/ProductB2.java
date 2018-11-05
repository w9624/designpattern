package designpattern.abstractfactory;

/**
 * @author wangrz 
 * ProductB的 2 实现
 */
public class ProductB2 extends ProductB {

	@Override
	public void showB() {
		System.out.println(this.getClass().getSimpleName());
	}

}