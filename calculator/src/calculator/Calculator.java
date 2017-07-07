package calculator;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Calculator {

	public static void main(String[] str) {
		BinaryOperator<Double> add = (p1, p2) -> p1 + p2;
		BinaryOperator<Double> sub = (p1, p2) -> p1 - p2;
		BinaryOperator<Double> mul = (p1, p2) -> p1 * p2;
		BinaryOperator<Double> div = (p1, p2) -> {
			if (p2 == 0)
				throw new IllegalArgumentException();
			else
				return p1 / p2;
		};

		Calculator calculator = new Calculator();
		calculator.print(add, 2D, 3D);
		calculator.print(sub, 2D, 3D);
		calculator.print(mul, 2D, 3D);
		calculator.print(div, 4D, 1D);

		BinaryOperator<Double> adder = ((p1, p2) -> p1 + p2);
		Consumer<BinaryOperator<Double>> printer = p -> System.out.println(p.apply(1D,2D));
		printer.accept(adder);

	}

	public void print(BinaryOperator<Double> operation, Double a, Double b) {
		System.out.println(operation.apply(a, b));
	}
}
