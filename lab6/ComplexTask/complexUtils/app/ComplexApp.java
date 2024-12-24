package complexUtils.app;
import complexUtils.complex.Complex;


public class ComplexApp{

	public static void start() {
		Complex<Double> complex1 = new Complex<>(5.0, 3.0);
        Complex<Double> complex2 = new Complex<>(2.0, 4.0);

		Complex<Double> complex3 = complex1.add(complex2);

		
	}
	
}