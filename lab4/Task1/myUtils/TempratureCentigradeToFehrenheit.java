package myUtils;
import java.util.function.Function;

public class TempratureCentigradeToFehrenheit implements Function<Number, Double> {
		@Override
		public Double apply(Number centigrade){
			return (centigrade * (float)(9 / 5)) + 32;
		}
}

