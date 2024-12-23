package myUtils;

import java.util.function.Function;

class QuadraticRoots implements Function<Double[], Double[]> {
	private Double[] getRoots(Double a, Double b, Double c){
		
		double radicand = (b * b) - (4.0 * a * c);

		if (radicand < 0) {
			return new Double[]{Double.NaN, Double.NaN};
		}

		if (radicand == 0) {
			double root = -b / (2.0 * a);
			return new Double[]{root, root};
		}

		double sqrtRadicand = Math.sqrt(radicand);
		double root1 = (-b + sqrtRadicand) / (2.0 * a);
		double root2 = (-b - sqrtRadicand) / (2.0 * a);

		return new Double[]{root1, root2};
	
	}

	private void handelEquationLength(int equationLength){
		if (equationLength != 3) {
			throw new IllegalArgumentException("Expected 3 coefficients: a, b, and c.\nax^2 + bx + c");
		}
	}
	
	@Override
	public Double[] apply(Double[] equation) {
		int equationLength = equation.length;
		handelEquationLength(equationLength);

		

		double a = equation[0];
		double b = equation[1];
		double c = equation[2];
		
		if (a == 0) {
			throw new IllegalArgumentException("Cannot be zero in a quadratic equation.");
		}
		
		return getRoots(a, b, c);

		
	}
}

