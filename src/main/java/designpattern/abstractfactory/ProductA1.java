package designpattern.abstractfactory;

/**
 * @author wangrz 
 * ProductA的 1 实现
 */
public class ProductA1 extends ProductA {

	@Override
	public void showA() {
		System.out.println(this.getClass().getSimpleName());
	}

}
