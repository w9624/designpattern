package designpattern.visitor;

/**
 * @author wangrz
 * 定义数据结构公共操作
 */
public interface Visitor {

	void visitConcreteElementA(ConcreteElementA ca);
	
	void visitConcreteElementB(ConcreteElementB cb);
	
}
