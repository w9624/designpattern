package designpattern.composite;

/**
 * @author wangrz
 * 叶子
 */
public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
		System.out.println("Cannot add a leaf");
	}

	@Override
	public void remove(Component c) {
		System.out.println("Cannot remove a leaf");
	}

	@Override
	public void show(int depth) {
		for (int i = 0; i < depth; i++) {
			System.out.print("-");
		}
		System.out.println(name);
	}

}
