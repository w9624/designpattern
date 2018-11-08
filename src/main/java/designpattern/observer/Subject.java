package designpattern.observer;

import java.util.ArrayList;

/**
 * @author wangrz
 * 抽象主题，提供一个接口，可以增加和删除和观察者对象
 */
public abstract class Subject {

	private ArrayList<Observer> observers = new ArrayList<>();
	
	public void attach(Observer o) {
		observers.add(o);
	}
	
	public void detach(Observer o) {
		observers.remove(o);
	}
	
	public void notice() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
	
}
