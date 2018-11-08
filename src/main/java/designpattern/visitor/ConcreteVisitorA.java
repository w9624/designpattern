package designpattern.visitor;

public class ConcreteVisitorA implements Visitor {

	@Override
	public void visitConcreteElementA(ConcreteElementA ca) {
		System.out.println(ca.getClass().getSimpleName() + "…………" + this.getClass().getSimpleName());
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB cb) {
		System.out.println(cb.getClass().getSimpleName() + "…………" + this.getClass().getSimpleName());
	}

}
