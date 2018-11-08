package designpattern.observer;

/**
 * @author wangrz
 * 具体主题，实现Subject，包含状态
 */
public class ConcreteSubject extends Subject {
	
	private String subState;

	public String getSubState() {
		return subState;
	}

	public void setSubState(String subState) {
		this.subState = subState;
	}

}
