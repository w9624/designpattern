package designpattern.command;

public class App {

	public static void main(String[] args) {
		//创建命令处理者
		Receiver receiver = new Receiver();
		//创建命令，指定处理者
		Command commandA = new ConcreteCommandA(receiver);
		Command commandB = new ConcreteCommandB(receiver);
		//invoker接受并执行命令
		Invoker invoker = new Invoker();
		invoker.setCommand(commandA);
		invoker.setCommand(commandB);
		invoker.execute();
		//invoker取消命令
		invoker.setCommand(commandA);
		invoker.setCommand(commandB);
		invoker.cancleCommand(commandA);
		invoker.execute();
	}

}
