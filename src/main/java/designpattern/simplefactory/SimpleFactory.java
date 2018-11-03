package designpattern.simplefactory;

/**
 * @author wangrz
 * 简单工厂（静态方法工厂）
 * 根据传入的操作符判断创建那个对象
 */
public class SimpleFactory {
	
	public static Operation create(String op) {
		Operation operation = null;
		switch (op) {
			case "+":
				operation = new OperationAdd();
				break;
			case "/":
				operation = new OperationDivide();
				break;
			default:
				break;
		}
		return operation;
	}

}
