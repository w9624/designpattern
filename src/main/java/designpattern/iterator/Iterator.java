package designpattern.iterator;

/**
 * 
 * @author wangrz
 * 迭代抽象类，用于得到开始对象、得到下一个对象、判断是否到结尾、当前对象等抽象方法
 * 统一接口
 * @param <E>
 */
public interface Iterator<E> {
	
	E next();
	
	boolean hasNext();
	
	E remove();
}
