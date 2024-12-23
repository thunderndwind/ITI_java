package myUtils;

public class App {
	private static void printEquationRoots(Double a, Double b, Double c, int equationNumber){
		
		QuadraticRoots quadraticRoots = new QuadraticRoots();
		
		Double[] equation = {a, b, c};
		Double[] roots = quadraticRoots.apply(equation);

		System.out.println("Roots of the equation number " + equationNumber +" :");
		System.out.println("Root 1: " + roots[0]);
		System.out.println("Root 2: " + roots[1]);
		System.out.println();
	
	}
	
	public static void start() {
		try {

			printEquationRoots(1.0, -5.0, 3.0, 1);
			printEquationRoots(1.0, 4.0, 4.0, 2);
			printEquationRoots(1.0, 5.0, 3.0, 3);
			printEquationRoots(0.0, 5.0, 3.0, 4);
	 
		} catch (IllegalArgumentException exc){
			System.out.println(exc.getMessage());
		} catch (Exception exc) {
		    	System.out.println(exc.getMessage());
		} 
	}
}
