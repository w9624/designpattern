package designpattern.interpreter;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		//上下文对象
		Context context = new Context();
		ArrayList<AbstractExpression> list = new ArrayList<>();
		list.add(new NonterminalExpression());
		list.add(new TerminalExpression());
		for (AbstractExpression exp : list) {
			exp.interpret(context);
		}
	}

}
