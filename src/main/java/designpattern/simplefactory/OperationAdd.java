package designpattern.simplefactory;

/**
 * @author wangrz
 * 加法操作
 */
public class OperationAdd extends Operation {

	@Override
	public double getResult() {
		return numA + numB;
	}

}
