package designpattern.interpreter;

public class TerminalExpression implements AbstractExpression {

	@Override
	public void interpret(Context context) {
		System.out.println("终端解释器");
	}

}
