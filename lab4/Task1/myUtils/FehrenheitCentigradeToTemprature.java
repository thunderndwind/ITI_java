package myUtils;
import java.util.function.Function;

public class FehrenheitCentigradeToTemprature implements Function<Number, Double> {
		@Override
		public Double apply(Number fehrenheit){
			return ( (fehrenheit - 32) * (float)(5.0 / 9.0) );
		}
} 


