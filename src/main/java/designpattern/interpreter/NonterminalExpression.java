package designpattern.interpreter;

public class NonterminalExpression implements AbstractExpression {

	@Override
	public void interpret(Context context) {
		System.out.println("非终端解释器");
	}

}
