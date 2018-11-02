package designpattern.ChainOfResponsibility;

/**
 * @author wangrz
 * handle实现，负责处理级别5-10
 */
public class ConcreteHandleB extends Handle {

	@Override
	public void handleRequest(int request) {
		if (request < 10) {
			System.out.println("ConcreteHandleB 已经处理请求！");
		}else {
			if (successor != null) {
				successor.handleRequest(request);
			}
		}
	}
}
