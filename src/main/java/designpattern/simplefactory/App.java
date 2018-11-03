package designpattern.simplefactory;

public class App {

	public static void main(String[] args) {
		//直接从简单工厂获取操作对象
		Operation opAdd = SimpleFactory.create("+");
		Operation opDivide = SimpleFactory.create("/");
		//设置值
		opAdd.numA = 1; opAdd.numB = 2;
		opDivide.numA = 4; opDivide.numB = 2;
		//计算
		System.out.println(opAdd.getResult());
		System.out.println(opDivide.getResult());
		//除法除数为0
		opDivide.numB = 0;
		opDivide.getResult();
	}

}
