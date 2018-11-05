package designpattern.builder;

import java.util.ArrayList;

public class Product {

	private ArrayList<String> parts = new ArrayList<>();

	public Product() {
	}

	public void add(String part) {
		parts.add(part);
	}

	public void show() {
		System.out.println(this.getClass().getSimpleName() + "构件：");
		for (String string : parts) {
			System.out.print(string + "  ");
		}
		System.out.println();
	}
}
