package designpattern.prototype;

/**
 * @author wangrz
 * 实现深复制
 */
public class ConcretePrototypeB extends Prototype{

	public ConcretePrototypeB() {
	}
	
	public ConcretePrototypeB(int id, Integer integer) {
		super(id, integer);
	}

	@Override
	public Prototype Clone() {
		ConcretePrototypeB cpb = new ConcretePrototypeB();
		cpb.id = this.id;
		cpb.integer = new Integer(this.getInteger());
		return cpb;
	}

}
