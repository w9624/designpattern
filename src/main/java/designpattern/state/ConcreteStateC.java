package designpattern.state;

/**
 * @author wangrz 
 * ConcreteStateC，下一个状态为ConcreteStateA
 */
public class ConcreteStateC implements State {

	@Override
	public void handle(Context context) {
		context.setState(new ConcreteStateA());
	}

}