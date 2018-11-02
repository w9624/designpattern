package designpattern.command;

/**
 * @author wangrz
 * Command 的实现A
 */
public class ConcreteCommandA extends Command{

	public ConcreteCommandA(Receiver receiver) {
		super(receiver);
	}

	public void excute() {
		receiver.actionA();
	}

}
