package designpattern.observer;

/**
 * @author wangrz
 * 具体观察者
 */
public class ConcreteObserverA implements Observer {
	
	private String name;
	private String state;
	private ConcreteSubject subject;
	
	public ConcreteObserverA(ConcreteSubject subject, String name) {
		this.name = name;
		this.subject = subject;
	}

	@Override
	public void update() {
		state = subject.getSubState();
		System.out.println("ObserverA name :" + name + "  " + state);
	}

	public ConcreteSubject getSubject() {
		return subject;
	}

	public void setSubject(ConcreteSubject subject) {
		this.subject = subject;
	}

}
