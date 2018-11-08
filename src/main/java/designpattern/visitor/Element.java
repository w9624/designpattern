package designpattern.visitor;

/**
 * @author wangrz
 * 定义数据结构接收公共操作
 */
public interface Element {

	void accept(Visitor visitor);
	
}
