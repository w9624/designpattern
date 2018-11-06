package designpattern.state;

/**
 * @author wangrz 
 * ConcreteStateB，下一个状态为ConcreteStateC
 */
public class ConcreteStateB implements State {

	@Override
	public void handle(Context context) {
		context.setState(new ConcreteStateC());
	}

}
