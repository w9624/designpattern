package designpattern.builder;

/**
 * @author wangrz
 * 指挥者，负责确定构建过程顺序
 */
public class Director {
	public void Construct(Builder builder) {
		builder.builderPartOne();
		builder.builderPartTwo();
	}
}
