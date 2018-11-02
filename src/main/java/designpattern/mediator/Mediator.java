package designpattern.mediator;

/**
 * @author wangrz
 * Meidator中介器，只具有通信方法
 */
abstract class Mediator {
	public abstract void send(String msg, Colleague colleague);
}
