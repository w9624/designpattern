package designpattern.mediator;

/**
 * @author wangrz
 * Colleague 的实现B
 */
public class ConcreteColleagueB extends Colleague {

	public ConcreteColleagueB(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void send(String msg) {
		mediator.send(msg, this);
	}
	
	@Override
	public void notify(String msg) {
		System.out.println("ColleagueB 得到通知：" + msg);
	}

}
