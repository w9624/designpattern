package designpattern.composite;

public class App {

	public static void main(String[] args) {
		//根节点
		Composite root = new Composite("root");
		root.add(new Leaf("Leaf A"));
		root.add(new Leaf("Leaf B"));
		//一层枝干
		Composite com = new Composite("Composite X");
		com.add(new Leaf("Leaf XA"));
		root.add(com);
		//二层枝干
		Composite comp = new Composite("Composite Y");
		comp.add(new Leaf("Leaf XY"));
		com.add(comp);
		
		Leaf leaf = new Leaf("C");
		root.add(leaf);
		root.show(1);
		
		root.remove(leaf);
		root.show(1);

	}

}
