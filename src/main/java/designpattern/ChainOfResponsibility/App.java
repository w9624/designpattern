package designpattern.ChainOfResponsibility;

public class App {

	public static void main(String[] args) {
		//确定职责链顺序，可根据需求灵活变动，职责链一定要包含所有状况
		Handle ha = new ConcreteHandleA();
		Handle hb = new ConcreteHandleB();
		Handle hc = new ConcreteHandleC();
		ha.setSuccessor(hb);
		hb.setSuccessor(hc);
    //设置多个不同请求级别
		int[] requests = new int[] {1, 6, 12};
		for (int i : requests) {
			ha.handleRequest(i);
		}
	}

}
