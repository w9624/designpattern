package designpattern.ChainOfResponsibility;

/**
 * @author wangrz
 * handle实现，负责处理级别5以下请求
 */
public class ConcreteHandleA extends Handle {

	public void handleRequest(int request) {
		if (request < 5) {
			System.out.println("ConcreteHandleA 已经处理请求！");
		}else {
			if (successor != null) {
				successor.handleRequest(request);
			}
		}
	}
	
}
