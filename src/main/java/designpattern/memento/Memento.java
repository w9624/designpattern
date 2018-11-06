package designpattern.memento;

public class Memento {
	
	private String state;

	public Memento(String state) {
		super();
		this.state = state;
	}

	public String getMemento() {
		return state;
	}

	public void setMemento(String state) {
		this.state = state;
	}

}
