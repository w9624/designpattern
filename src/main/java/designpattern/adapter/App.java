package designpattern.adapter;

public class App {

	public static void main(String[] args) {
		//对象适配器
		ObjectTarget ot = new ObjectAdapter();
		ot.request();
		//类适配器
		ClassTarget ct = new ClassAdapter();
		ct.request();
		//接口适配器
		InAbstractClass it = new InConcreteClass();
		it.show();
	}

}
