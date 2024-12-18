class Main{

	public static void main(String args[]){
		int argsLength = args.length;
		if (argsLength != 2){
			System.out.println("Warning: App takes two input(argument) \nspecial characters like \"*, &, #, (, )\" are not allowed");
			return;
		}

		String integerPattern = "[+]?\\d{1,2}";

		if (args[0].matches(integerPattern)) {
		   	int enteredNumber = Integer.parseInt(args[0]);
			for (int i = 0; i < enteredNumber; i++){
				System.out.println("" + args[1]);
			}
		}
		else if (args[1].matches(integerPattern)) {
			int enteredNumber = Integer.parseInt(args[1]);
			for (int i = 0; i < enteredNumber; i++){
				System.out.println("" + args[0]);
			}
		}

		else {
		    System.out.println("You should Enter at least one positive integer number the repeating number");
		}
		

	}
}
