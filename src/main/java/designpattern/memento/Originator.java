package designpattern.memento;

public class Originator {
	
	private String state;
	
	public Originator() {
	}
	
	public Originator(String state) {
		super();
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Memento createMemento() {
		return new Memento(state);
	}
	
	public void setMenmoto(Memento menmoto) {
		this.state = menmoto.getMemento();
	}
	
	public void show() {
		System.out.println("State：" + state);
	}

}
