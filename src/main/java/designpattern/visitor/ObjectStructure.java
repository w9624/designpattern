package designpattern.visitor;

import java.util.ArrayList;

/**
 * @author wangrz ObjectStructure可以枚举它的元素
 */
public class ObjectStructure {

	private ArrayList<Element> elements = new ArrayList<>();

	public void attach(Element element) {
		elements.add(element);
	}

	public void detach(Element element) {
		elements.add(element);
	}

	// 对所有数据结构执行操作
	public void accept(Visitor visitor) {
		for (Element e : elements) {
			e.accept(visitor);
		}
	}

}
