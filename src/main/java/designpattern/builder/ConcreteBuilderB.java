package designpattern.builder;

public class ConcreteBuilderB implements Builder {

	private Product product = new Product();

	@Override
	public void builderPartOne() {
		product.add("构建A");
	}

	@Override
	public void builderPartTwo() {
		product.add("构建B");
	}

	@Override
	public Product getProduct() {
		return product;
	}

}
