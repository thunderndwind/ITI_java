import myUtils.App;

public class Main {
	public static void main(String[] args) {
		App.start();
	}
}








































/*
public class Main {
	public static void printEquationRoots(Double a, Double b, Double c, int equationNumber){
		QuadraticRoots quadraticRoots = new QuadraticRoots();
		
		Double[] equation = {a, b, c};
		Double[] roots = quadraticRoots.apply(equation);

		System.out.println("Roots of the equation number " + equationNumber +" :");
		System.out.println("Root 1: " + roots[0]);
		System.out.println("Root 2: " + roots[1]);
		System.out.println();
	
	}
	
	public static void main(String[] args) {
	try {
		printEquationRoots(1.0, -5.0, 3.0, 1);
		printEquationRoots(1.0, 4.0, 4.0, 2);
		printEquationRoots(1.0, 5.0, 3.0, 3);
		printEquationRoots(0.0, 5.0, 3.0, 4);
		
		
		QuadraticRoots quadraticRoots = new QuadraticRoots();
		
		Double[] equation2 = {1.0, 5.0, 3.0};
		Double[] roots2 = quadraticRoots.apply(equation2);

		System.out.println("Roots of the second equation:");
		System.out.println("Root 1: " + roots2[0]);
		System.out.println("Root 2: " + roots2[1]);
		System.out.println();

		Double[] equation3 = {1.0, -5.0, 3.0};
		Double[] roots3 = quadraticRoots.apply(equation3);

		System.out.println("Roots of the third equation:");
		System.out.println("Root 1: " + roots3[0]);
		System.out.println("Root 2: " + roots3[1]);
		System.out.println();

		Double[] equation4 = {1.0, 4.0, 4.0};
		Double[] roots4 = quadraticRoots.apply(equation4);

		System.out.println("Roots of the fourth equation:");
		System.out.println("Root 1: " + roots4[0]);
		System.out.println("Root 2: " + roots4[1]);
		System.out.println();
		
	    
	} catch (IllegalArgumentException exc){
		System.out.println(exc.getMessage());
	} catch (Exception exc) {
	    	System.out.println(exc.getMessage());
	} 
	}
}
*/

