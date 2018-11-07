package designpattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectAttack {

	public static Object attack(Object o) {

		try {
			Class<?> c = o.getClass();
			Constructor<?> constructor = c.getDeclaredConstructor(null);
			// 取消java的权限控制检查
			constructor.setAccessible(true);
			return constructor.newInstance();
		} catch (NoSuchMethodException | SecurityException | IllegalArgumentException | InvocationTargetException
				| InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

}
