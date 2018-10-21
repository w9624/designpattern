package designpattern.simplefactory;

public class OpAdd extends Operation{

	@Override
	public int getResult() {
		result = numA + numB;
		return result;
	}

}
