package designpattern.builder;

public class ConcreteBuilderA implements Builder {

	private Product product = new Product();

	@Override
	public void builderPartOne() {
		product.add("构建X");
	}

	@Override
	public void builderPartTwo() {
		product.add("构建Y");
	}

	@Override
	public Product getProduct() {
		return product;
	}

}
