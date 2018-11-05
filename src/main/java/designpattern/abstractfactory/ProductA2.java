package designpattern.abstractfactory;

/**
 * @author wangrz 
 * ProductA的 2 实现
 */
public class ProductA2 extends ProductA {

	@Override
	public void showA() {
		System.out.println(this.getClass().getSimpleName());
	}

}