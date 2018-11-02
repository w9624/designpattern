package designpattern.mediator;

/**
 * @author wangrz
 * Colleague 的实现A
 */
public class ConcreteColleagueA extends Colleague {

	public ConcreteColleagueA(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void send(String msg) {
		mediator.send(msg, this);
	}

	@Override
	public void notify(String msg) {
		System.out.println("ColleagueA 得到通知：" + msg);
	}

}
