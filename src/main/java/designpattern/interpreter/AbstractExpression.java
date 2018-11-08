package designpattern.interpreter;

/**
 * @author wangrz
 * 解释器接口
 */
public interface AbstractExpression {

	void interpret(Context context);
	
}
