package designpattern.visitor;

public class App {

	public static void main(String[] args) {
		// 创建数据结构
		ObjectStructure os = new ObjectStructure();
		os.attach(new ConcreteElementA());
		os.attach(new ConcreteElementB());
		// 创建操作
		ConcreteVisitorA cva = new ConcreteVisitorA();
		ConcreteVisitorB cvb = new ConcreteVisitorB();
		// 在结构上执行操作
		os.accept(cva);
		os.accept(cvb);
	}

}
