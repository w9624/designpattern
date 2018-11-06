package designpattern.state;

/**
 * @author wangrz
 * 上下文对象，持有状态
 */
public class Context {
	
	private State state;
	
	public Context(State state) {
		super();
		this.state = state;
		System.out.println("初始化状态：" + this.state.getClass().getSimpleName() + "\n");
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		System.out.println("当前的状态为：" + this.state.getClass().getSimpleName());
		this.state = state;
		System.out.println("下一个状态为：" + state.getClass().getSimpleName());
		System.out.println();
	}
	
	public void request() {
		state.handle(this);
	}

}
