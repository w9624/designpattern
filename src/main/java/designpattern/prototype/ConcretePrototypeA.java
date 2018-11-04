package designpattern.prototype;

/**
 * @author wangrz
 * 实现浅复制
 */
public class ConcretePrototypeA extends Prototype {

	public ConcretePrototypeA(int id, Integer integer) {
		super(id, integer);
	}

	@Override
	public Prototype Clone() {
		Prototype clone = null;
		try {
			clone = (Prototype) this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

}
