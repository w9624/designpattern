package designpattern.flyweight;

public class App {

	public static void main(String[] args) {
		// 创建工厂
		FlyweightFactory factory = FlyweightFactory.getInstance();
		// 普通用户共享ConcreteFlyweight博客对象
		Flyweight wblog = factory.getFlyweight("blog");
		wblog.operate("w");
		Flyweight zblog = factory.getFlyweight("blog");
		zblog.operate("z");
		// vip用户不共享博客对象
		Flyweight vip = new UnshareConcreteFlyweight("vipblog");
		vip.operate("vip");
		// 组合博客对象
		CompositeFlyweight admin = (CompositeFlyweight) factory.getCompositeFlyweight("adminblog");
		admin.add(wblog);
		admin.add(wblog);
		admin.add(vip);
		admin.operate("admin");
	}

}
