package designpattern.iterator;

/**
 * 
 * @author wangrz
 * 具体迭代器类，继承Iterator，实现抽象方法
 * @param <E>
 */
public class ConcreteIterator<E> implements Iterator<E> {

	private ConcreteAggregate<E> aggregate;
	private int count = 0;

	public ConcreteIterator(ConcreteAggregate<E> aggregate) {
		super();
		this.aggregate = aggregate;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E next() {
		if (hasNext()) {
			Integer i = aggregate.getItems().get(count);
			count++;
			return (E) i;
		}
		return null;
	}

	@Override
	public boolean hasNext() {
		if (count < aggregate.getItems().size()) {
			return true;
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E remove() {
		Integer i = aggregate.getItems().remove(count-1);
		count--;
		return (E) i;
	}

}
