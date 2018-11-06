package designpattern.state;

/**
 * @author wangrz 
 * 状态接口，定义与状态相关的操作
 */
public interface State {

	void handle(Context context);

}
