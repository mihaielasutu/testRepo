package calculator;

@FunctionalInterface
public interface Operation {
	public Double calc(Double a, Double b);
}
