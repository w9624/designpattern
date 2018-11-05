package designpattern.facade;

public class App {

	public static void main(String[] args) {
		//创建facade对象，不需要知道子系统
		Facade facade = new Facade();
		//调用方法
		facade.methodA();
		facade.methodB();
	}

}
