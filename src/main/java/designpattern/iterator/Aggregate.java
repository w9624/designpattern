package designpattern.iterator;

/**
 * 
 * @author wangrz
 * 抽象聚集类
 * @param <E>
 */
public abstract class Aggregate<E> {
	
	public abstract Iterator<E> iterator();

}
