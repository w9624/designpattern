package designpattern.decorator;

/**
 * @author wangrz
 * 对象接口的具体实现
 */
public class ConcreteComponent extends Component {

	@Override
	public void operate() {
		System.out.println("I am ConcreteComponent!");
	}

}
