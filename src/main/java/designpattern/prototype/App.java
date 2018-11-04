package designpattern.prototype;

public class App {

	public static void main(String[] args) {
		//对ConcretePrototypeA进行clone，比较引用类型地址
		ConcretePrototypeA cpa = new ConcretePrototypeA(0, 1);
		ConcretePrototypeA cpa1 = (ConcretePrototypeA)cpa.Clone();
		System.out.println(cpa.getInteger() == cpa1.getInteger());
		//对ConcretePrototypeB进行clone，比较引用类型地址
		ConcretePrototypeB cpb = new ConcretePrototypeB(2, 3);
		ConcretePrototypeB cpb1 = (ConcretePrototypeB)cpb.Clone();
		System.out.println(cpb.getInteger() == cpb1.getInteger());
	}

}
