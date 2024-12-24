package myUtils.customException;

public class NotIntParsable extends NumberFormatException {

	public NotIntParsable(){
	}

	public NotIntParsable(String arg){
		super(arg);
	}
} 
