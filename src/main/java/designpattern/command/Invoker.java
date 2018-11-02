package designpattern.command;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author wangrz
 * Command 接收者
 */
public class Invoker {
	//命令队列
	private ArrayList<Command> orders = new ArrayList<>();
	
	public Invoker() {
		
	}
	
	public void setCommand(Command command) {
		orders.add(command);
	}
	
	public void cancleCommand(Command command) {
		if (orders.contains(command)) {
			orders.remove(command);
		}
	}
	
	public void execute() {
		Iterator<Command> it = orders.iterator();
		while (it.hasNext()) {
			it.next().excute();
			it.remove();
		}
	}

}
