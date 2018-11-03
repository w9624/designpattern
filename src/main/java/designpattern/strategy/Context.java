package designpattern.strategy;

/**
 * @author ^_^
 * Context 持有Strategy接口，并通过构造器注入实现
 */
public class Context {
	
	private Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void algorithm() {
		strategy.algorithm();
	}

}
