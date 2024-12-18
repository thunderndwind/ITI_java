class Main{

	public static void main(String args[]){
		int argsLength = args.length;
		if (argsLength != 1){
			System.out.println("Warning: App takes one input(argument)");
			return;
		}

		String integerPattern = "[-+]?\\d{1,6}";
		String floatPattern = "[-+]?([0-9]*\\.[0-9]*)";

		if (args[0].matches(integerPattern)) {
		    System.out.println("You Entered Integer Number: " + args[0]);
		}

		else if (args[0].matches(floatPattern)) {
		    System.out.println("You Entered Float Number: " + args[0]);
		}

		else {
		    System.out.println("You Entered Text: " + args[0]);
		}

	}
}
