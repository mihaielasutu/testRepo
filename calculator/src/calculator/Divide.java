package calculator;

public class Divide implements Operation {

	@Override
	public Double calc(Double a, Double b) {
		if(a!=0){
			return a/b;
		}else
			throw new IllegalArgumentException();
	}

}
