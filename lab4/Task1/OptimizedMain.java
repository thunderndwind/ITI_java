import myUtils.TempratureCentigradeToFehrenheit;
import java.util.Scanner;
import java.util.function.Function;
import java.text.DecimalFormat;


public class OptimizedMain {

	public static void main(String[] args) {
		System.out.println("Welcome to the Temperature Converter App :)");
		Scanner scanner = new Scanner(System.in);

		try {
			boolean exited = false;
			DecimalFormat decimalFormat = new DecimalFormat("#.##");

			while (!exited) {
				printMenu();
				String input = scanner.nextLine();

				if (isValidChoice(input)) {
					int inputChoice = Integer.parseInt(input);
					switch (inputChoice) {
						case 1:
							handleCentigradeToFahrenheit(scanner, decimalFormat);
							break;
						case 2:
							handleFahrenheitToCentigrade(scanner, decimalFormat);
							break;
						case 3:
							exited = true;
							break;
						default:
							System.out.println("Invalid choice, please enter 1, 2, or 3.");
							break;
					}
				} else {
					System.out.println("Invalid input. Please enter a number between 1 and 3.");
				}
			}

		} catch (Exception exc) {
			System.out.println("Error: " + exc.getMessage());
		} finally {
			scanner.close();
		}
	}

	private static void printMenu() {
		System.out.println("\nMenu:");
		System.out.println("1. From Centigrade to Fahrenheit.");
		System.out.println("2. From Fahrenheit to Centigrade.");
		System.out.println("3. Quit.");
		System.out.print("Choose an option: ");
	}


	private static boolean isValidChoice(String input) {
		return input.matches("[1-3]");
	}


	private static void handleCentigradeToFahrenheit(Scanner scanner, DecimalFormat decimalFormat) {
		System.out.print("Enter Centigrade value: ");
		String inputCentigrade = scanner.nextLine();

		if (isValidNumber(inputCentigrade)) {
			double centigrade = Double.parseDouble(inputCentigrade);
			TempratureCentigradeToFehrenheit centigradeFehrenheitConverter = new TempratureCentigradeToFehrenheit();
			Double fehrenheitResult = centigradeFehrenheitConverter.apply(centigrade) ;
			System.out.println(centigrade + " Centigrade = " + decimalFormat.format(fehrenheitResult) + " Fahrenheit");
		} else {
			System.out.println("Invalid number, please enter a valid Centigrade value.");
		}
	}


	private static void handleFahrenheitToCentigrade(Scanner scanner, DecimalFormat decimalFormat) {
		System.out.print("Enter Fahrenheit value: ");
		String inputFahrenheit = scanner.nextLine();

		if (isValidNumber(inputFahrenheit)) {
			double fahrenheit = Double.parseDouble(inputFahrenheit);
			Function<Double, Double> fehrenheitCentigradeConverter = new Function<Double, Double>(){
				@Override
				public Double apply(Double fehrenheit){
					return ( (fehrenheit - 32) * (float)(5.0 / 9.0) );
				}
			};
			Double centigradeResult = fehrenheitCentigradeConverter.apply(fahrenheit) ;

			System.out.println(fahrenheit + " Fahrenheit = " + decimalFormat.format(centigradeResult) + " Centigrade");
		} else {
			System.out.println("Invalid number, please enter a valid Fahrenheit value.");
		}
	}


	private static boolean isValidNumber(String input) {
		return input.matches("[-+]?([0-9]*\\.?[0-9]+)");
	}
}

