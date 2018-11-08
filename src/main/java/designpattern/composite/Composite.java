package designpattern.composite;

import java.util.ArrayList;

/**
 * @author wangrz
 * 枝干
 */
public class Composite extends Component {
	
	private ArrayList<Component> list = new ArrayList<>();

	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
		list.add(c);
	}

	@Override
	public void remove(Component c) {
		list.remove(c);
	}

	@Override
	public void show(int depth) {
		for (int i = 0; i < depth; i++) {
			System.out.print("-");
		}
		System.out.println(name);
		for (Component component : list) {
			component.show(depth+2);
		}
	}

}
