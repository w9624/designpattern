package designpattern.memento;

import java.util.ArrayList;

public class CareTaker {
	
	private ArrayList<Memento> mementos = new ArrayList<>();

	public Memento getMemento() {
		if (mementos.size() <= 0) {
			try {
				throw new Exception("无法再向前恢复了！");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return mementos.remove(mementos.size() - 1);
	}

	public void setMemento(Memento memento) {
		mementos.add(memento);
	}

}
