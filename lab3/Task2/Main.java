public class Main{
	
	static class Splitter{
		public static String[] splitIpAddressPattern(final String str) throws Exception{
		
			String ipPattern = "^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}$";
			// String ipPattern = "^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}$";
			// String ipPattern = "(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])";
			
			if (!str.matches(ipPattern)) {
			    throw new Exception("the ip given is not a valid ip address\nip addess pattern : x.x.x.x where x is from 0 to 255");
			}
			
			String[] temp = str.split(".");
			return temp;
		}
	}
	public static void main(String args[]){
		try {
			int argsLength = args.length;
			if (argsLength != 1){
				System.out.println("Warning: App takes one input(argument) The ip");
				return;
			}
			
			String[] ipAddress =  Splitter.splitIpAddressPattern(args[0]);
			System.out.println("You enterd a valid ip address");
		
		
		} catch(Exception exc){
			System.out.println(exc.getMessage());
		}
		
	}
}
