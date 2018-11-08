package designpattern.flyweight;

/**
 * @author wangrz
 * 享元类接口，通过接口接收作用于外部状态
 */
public interface Flyweight {
	
	void operate(String user);

}
