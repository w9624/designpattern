package designpattern.command;

/**
 * @author wangrz
 * 实际命令执行者
 */
public class Receiver {
	
	public void actionA() {
		System.out.println("执行请求A!");
	}
	
	public void actionB() {
		System.out.println("执行请求B!");
	}

}
