package designpattern.templatemethod;

/**
 * @author wangrz
 * 模板方法
 * show方法为公共方法
 * run方法在子类中有不同实现
 */
public abstract class AbstractClass {
	
	public abstract void run();
	
	public final void show() {
		System.out.println("公共方法：" + this.getClass().getSimpleName());
	}

}
