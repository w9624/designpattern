package designpattern.singleton;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableAttack {
	
	@SuppressWarnings("resource")
	public static Object attack(Object o) {
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		try {
			//写出
			oos = new ObjectOutputStream(new FileOutputStream("F:/test.txt"));
			oos.writeObject(o);
			oos.flush();
			oos.close();
			//写入
			ois = new ObjectInputStream(new FileInputStream("F:/test.txt"));
			return (Object)ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

}
