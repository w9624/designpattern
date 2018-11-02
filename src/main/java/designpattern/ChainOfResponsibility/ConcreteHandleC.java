package designpattern.ChainOfResponsibility;

/**
 * @author wangrz
 * handle实现，负责处理级别10及以上
 */
public class ConcreteHandleC extends Handle {

	@Override
	public void handleRequest(int request) {
		if (request >= 10) {
			System.out.println("ConcreteHandlec 已经处理请求！");
		}
	}
}
