package designpattern.memento;

public class App {

	public static void main(String[] args) {
		//创建Originator，初始状态为 init
		Originator org = new Originator("init");
		org.show();
		//创建管理者
		CareTaker ct = new CareTaker();
		//保存状态然后更换状态
		ct.setMemento(org.createMemento());
		org.setState("run");
		org.show();
		ct.setMemento(org.createMemento());
		org.setState("destory");
		org.show();
		//恢复状态然后显示
		org.setMenmoto(ct.getMemento());
		org.show();
		org.setMenmoto(ct.getMemento());
		org.show();
	}

}
