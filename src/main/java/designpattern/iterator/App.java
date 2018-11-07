package designpattern.iterator;

public class App {

	public static void main(String[] args) {
		//创建聚集对象，并模拟属性
		ConcreteAggregate<Integer> aggregate = new ConcreteAggregate<>();
		aggregate.add(1);
		aggregate.add(2);
		aggregate.add(3);
		
		//遍历
		Iterator<Integer> it = aggregate.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
