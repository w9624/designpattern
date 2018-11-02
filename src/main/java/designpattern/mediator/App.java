package designpattern.mediator;

public class App {
	
	public static void main(String[] args) {
		//创建中介器和通信对象
		ConcreteMediator mediator = new ConcreteMediator();
		Colleague ca = new ConcreteColleagueA(mediator);
		Colleague cb = new ConcreteColleagueB(mediator);
		//配置中介器通信对象
		mediator.setColleagueA(ca);
		mediator.setColleagueB(cb);
		//对象通信
		ca.send("I am CA!");
		cb.send("I am CB!");
	}

}
