package designpattern.facade;

/**
 * @author wangrz
 * Facade接口，对外提供子系统的访问
 */
public class Facade {
	
	SubSystemA sA;
	SubSystemB sB;
	SubSystemC sC;
	
	public Facade() {
		sA = new SubSystemA();
		sB = new SubSystemB();
		sC = new SubSystemC();
	}
	
	public void methodA() {
		sA.methodA();
		sB.methodB();
	}
	
	public void methodB() {
		sA.methodA();
		sC.methodC();
	}

}
