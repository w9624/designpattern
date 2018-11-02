package designpattern.mediator;

/**
 * @author wangrz
 * Colleague 具体通信对象的父类
 */
abstract class Colleague {
	protected Mediator mediator;

	public Colleague(Mediator mediator) {
		super();
		this.mediator = mediator;
	}
	
	public abstract void send(String msg);
	
	public abstract void notify(String msg);
}
