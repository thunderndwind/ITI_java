package myUtils.customException;

public class NotFloatParsable extends NumberFormatException {

    public NotFloatParsable(){
    }

    public NotFloatParsable(String arg){
        super(arg);
    }
}
