package designpattern.iterator;

import java.util.ArrayList;

/**
 * 
 * @author wangrz
 * 具体聚集类，继承Aggregate
 * @param <E>
 */
public class ConcreteAggregate<E> extends Aggregate<E>{
	
	private ArrayList<Integer> Items = new ArrayList<>();

	@Override
	public Iterator<E> iterator() {
		return new ConcreteIterator<>(this);
	}

	public ArrayList<Integer> getItems() {
		return Items;
	}

	public void add(Integer integer) {
		Items.add(integer);
	}

}
