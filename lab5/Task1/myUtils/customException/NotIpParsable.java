package myUtils.customException;

public class NotIpParsable extends IllegalArgumentException {

    public NotIpParsable(){
    }
    
    public NotIpParsable(String arg){
        super(arg);
    }
}
