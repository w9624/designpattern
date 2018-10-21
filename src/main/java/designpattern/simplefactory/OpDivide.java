package designpattern.simplefactory;

public class OpDivide extends Operation {

	@Override
	public int getResult() {
		if (numB == 0) {
			throw new ArithmeticException("被除数不能为0");
		}
		result = numA / numB;
		return result;
	}

}
