package designpattern.simplefactory;

/**
 * @author wangrz
 * 1.解决问题：面向接口具体实现的选择
 * 2.工厂通过参数确定创建那个子类
 * 3.优点：容易扩展；屏蔽具体实现，用户只需要知道接口（Operation）
 * 4.缺点：添加或删减运算，需要修改工厂的create逻辑
 */
public class OpFactory {
	
	public static Operation create(String op) {
		Operation operation = null;
		switch (op) {
			case "+":
				operation = new OpAdd();
				break;
			case "/":
				operation = new OpDivide();
				break;
		}
		return operation;
	}

}
