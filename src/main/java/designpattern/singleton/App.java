package designpattern.singleton;

public class App {

	public static void main(String[] args) {

		System.out.println("————————————————一般懒汉模式————————————————");
		SingletonOne one1 = SingletonOne.getInstance();
		SingletonOne one2 = SingletonOne.getInstance();
		System.out.println(one1 == one2);
		// 使用反射创建新单例
		SingletonOne one3 = (SingletonOne) ReflectAttack.attack(one1);
		System.out.println("反射攻击:" + (one1 == one3));

		System.out.println("————————————————加锁懒汉模式————————————————");
		SingletonTwo two1 = SingletonTwo.getInstance();
		SingletonTwo two2 = SingletonTwo.getInstance();
		System.out.println(two1 == two2);
		// 使用反射创建新单例，SingletonTwo会判断反射攻击
		SingletonTwo two3 = (SingletonTwo) ReflectAttack.attack(two1);
		System.out.println("反射攻击创建对象失败 two3:" + (two3));

		System.out.println("————————————————双重锁懒汉模式————————————————");
		SingletonThree three1 = SingletonThree.getInstance();
		SingletonThree three2 = SingletonThree.getInstance();
		System.out.println(three1 == three2);
		// 使用序列化创建新单例
		SingletonThree three3 = (SingletonThree) SerializableAttack.attack(three1);
		System.out.println("序列化攻击：" + (three1 == three3));

		System.out.println("————————————————饿汉模式————————————————");
		SingletonFour four1 = SingletonFour.getInstance();
		SingletonFour four2 = SingletonFour.getInstance();
		System.out.println(four1 == four2);
		// 使用序列化创建新单例，SingletonFour防止序列化攻击
		SingletonFour four3 = (SingletonFour) SerializableAttack.attack(four1);
		System.out.println("序列化攻击：" + (four1 == four3));

		System.out.println("————————————————静态内部类模式————————————————");
		SingletonFive five1 = SingletonFive.getInstance();
		SingletonFive five2 = SingletonFive.getInstance();
		System.out.println(five1 == five2);

		System.out.println("————————————————枚举模式————————————————");
		SingletonSix six1 = SingletonSix.getInstance();
		SingletonSix six2 = SingletonSix.getInstance();
		System.out.println(six1 == six2);
		// 使用反射创建新单例，单例模式没有构造方法哈……
		SingletonSix six3 = (SingletonSix) ReflectAttack.attack(six1);
		System.out.println("反射攻击：" + (six3 == six1));
		// 使用序列化创建新单例
		SingletonSix six4 = (SingletonSix) SerializableAttack.attack(six1);
		System.out.println("序列化攻击：" + (six1 == six4));
		
	}

}
