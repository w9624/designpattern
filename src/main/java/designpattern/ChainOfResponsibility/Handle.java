package designpattern.ChainOfResponsibility;

/**
 * @author wangrz
 * Handle的接口
 */
public abstract class Handle {
	
	protected Handle successor;

	public void setSuccessor(Handle successor) {
		this.successor = successor;
	}
	
	public abstract void handleRequest(int request);

}
