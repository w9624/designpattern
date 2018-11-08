package designpattern.observer;

public class App {

	public static void main(String[] args) {
		// 创建主题，并加入观察者
		ConcreteSubject s = new ConcreteSubject();
		s.attach(new ConcreteObserverA(s, "wang"));
		s.attach(new ConcreteObserverA(s, "liu"));
		ConcreteObserverA ca = new ConcreteObserverA(s, "zhang");
		s.attach(ca);
		// 主题状态更改，通知观察者
		s.setSubState("stand up");
		s.notice();
		// 移除观察者ca
		s.detach(ca);
		// 主题状态更改，通知观察者
		s.setSubState("sit down");
		s.notice();
	}

}
