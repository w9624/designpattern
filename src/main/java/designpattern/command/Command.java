package designpattern.command;

/**
 * @author wangrz
 * 命令接口
 */
public abstract class Command {
	
	protected Receiver receiver;
	
	
	public Command(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	abstract void excute();

}
