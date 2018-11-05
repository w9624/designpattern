package designpattern.builder;

/**
 * @author wangrz 
 * 建造者接口，确定建造的过程方法
 */
public interface Builder {

	void builderPartOne();

	void builderPartTwo();

	Product getProduct();

}
