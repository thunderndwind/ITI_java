package myUtils.app;

import java.util.Scanner;
import myUtils.customException.NotFloatParsable;
import myUtils.customException.NotIntParsable;
import myUtils.customException.NotIpParsable;
import myUtils.customParsing.Parser;

public class App {

	public static void start() {
		System.out.println("Welcome to the Parser App :)");
		Scanner scanner = new Scanner(System.in);

		try {
			boolean exited = false;

			while (!exited) {
				printMenu();
				String input = scanner.nextLine();

				if (isValidChoice(input)) {
					int inputChoice = Integer.parseInt(input);
					switch (inputChoice) {
						case 1:
							handleIntNumber(scanner);
							break;
						case 2:
							handleFloatNumber(scanner);
							break;
						case 3:
							handleIpAddress(scanner);
							break;
						case 4:
							exited = true;
							break;
						default:
							System.out.println("Invalid choice, please enter 1, 2, 3 or 4.");
							break;
					}
				} else {
					System.out.println("Invalid input. Please enter a number between 1 and 4.");
				}
			}

		} catch (NotFloatParsable exc) {
			System.out.println("Error: " + exc.getMessage());
		} catch (NotIntParsable exc) {
			System.out.println("Error: " + exc.getMessage());
		} catch (NotIpParsable exc) {
			System.out.println("Error: " + exc.getMessage());
		} catch (Exception exc) {
			System.out.println("Error: " + exc.getMessage());
		} finally {
			scanner.close();
		}
	}

	private static void printMenu() {
		System.out.println("\nMenu:");
		System.out.println("1. Parse Integer.");
		System.out.println("2. Parse Float.");
		System.out.println("3. Parse IP Address.");
		System.out.println("4. Quit.");

		System.out.print("Choose an option: ");
	}

	private static boolean isValidChoice(String input) {
		return input.matches("[1-4]");
	}

	private static void handleIntNumber(Scanner scanner) {
		System.out.print("Enter Integer value: ");
		String inputNumber = scanner.nextLine();

		int number = Parser.parseInt(inputNumber);

		System.out.println("Parsable Integer Number Entered: " + number);

	}

	private static void handleFloatNumber(Scanner scanner) {

		System.out.print("Enter Float value: ");

		String inputNumber = scanner.nextLine();

		float number = Parser.parseFloat(inputNumber);

		System.out.println("Parsable Float Number Entered: " + number);
	}

	private static void handleIpAddress(Scanner scanner) {

		System.out.print("Enter valid IP Address: ");

		String inputIp = scanner.nextLine();

		String ip = Parser.parseIp(inputIp);

		System.out.println("Parsable Float Number Entered: " + ip);
	}

}
