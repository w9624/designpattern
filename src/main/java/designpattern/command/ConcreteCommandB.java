package designpattern.command;

/**
 * @author wangrz
 * Command 的实现B
 */
public class ConcreteCommandB extends Command{

	public ConcreteCommandB(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void excute() {
		receiver.actionB();
	}
}
