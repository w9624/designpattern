package designpattern.decorator;

/**
 * @author wangrz
 * 装饰器抽象类
 */
public class Decorator extends Component{
	//持有接口对象
	protected Component component;
	
	public void setComponent(Component component) {
		this.component = component;
	}

	@Override
	public void operate() {
		if (component != null) {
			component.operate();
		}
	}

}
