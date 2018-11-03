package designpattern.simplefactory;

/**
 * @author wangrz
 * 除法操作
 */
public class OperationDivide extends Operation {

	@Override
	public double getResult() {
		if (numB == 0) {
			try {
				throw new Exception("被除数不能为0！");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return numA / numB;
	}

}
