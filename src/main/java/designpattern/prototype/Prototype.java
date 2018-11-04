package designpattern.prototype;

/**
 * @author wangrz
 * 原型类
 */
public abstract class Prototype implements Cloneable{
	
	protected int id;
	protected Integer integer;

	public Prototype() {
		super();
	}
	
	public Prototype(int id, Integer integer) {
		super();
		this.id = id;
		this.integer = integer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getInteger() {
		return integer;
	}

	public void setInteger(Integer integer) {
		this.integer = integer;
	}

	public abstract Prototype Clone();

}
