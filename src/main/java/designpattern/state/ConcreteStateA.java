package designpattern.state;

/**
 * @author wangrz 
 * ConcreteStateA，下一个状态为ConcreteStateB
 */
public class ConcreteStateA implements State {

	@Override
	public void handle(Context context) {
		context.setState(new ConcreteStateB());
	}

}