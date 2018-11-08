package designpattern.composite;

/**
 * @author wangrz
 * 枝干和叶子的接口，使用的时透明方式
 */
public abstract class Component {
	
	protected String name;

	public Component(String name) {
		super();
		this.name = name;
	}
	
	public abstract void add(Component c);
	
	public abstract void remove(Component c);
	
	public abstract void show(int depth);

}
