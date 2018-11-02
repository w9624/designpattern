package designpattern.mediator;

/**
 * @author wangrz
 * mediator 中介器的实现
 */
public class ConcreteMediator extends Mediator{
	
	private Colleague colleagueA;
	private Colleague colleagueB;
	
	public void setColleagueA(Colleague colleagueA) {
		this.colleagueA = colleagueA;
	}

	public void setColleagueB(Colleague colleagueB) {
		this.colleagueB = colleagueB;
	}

	@Override
	public void send(String msg, Colleague colleague) {
		if (colleague == colleagueA) {
			colleagueB.notify(msg);
		}else {
			colleagueA.notify(msg);
		}
		
	}

}
