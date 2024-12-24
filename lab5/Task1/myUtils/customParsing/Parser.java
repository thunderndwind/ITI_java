package myUtils.customParsing;
import myUtils.customException.NotFloatParsable;
import myUtils.customException.NotIntParsable;
import myUtils.customException.NotIpParsable;


public class Parser {
    private static String integerPattern = "[-+]?\\d{1,6}";
	private static String floatPattern = "[-+]?([0-9]*\\.[0-9]*)";
    private static String ipPattern = "^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}$";

    public static int parseInt(String possibleInt) throws NotIntParsable {

        if (!possibleInt.matches(integerPattern)) {
            throw new NotIntParsable("The given Input is Integer");
		} else {
            return Integer.parseInt(possibleInt);
        }

    }

    public static float parseFloat(String possibleFloat) throws NotFloatParsable{

        if (possibleFloat.matches(floatPattern)) {
		    throw new NotFloatParsable("The given Input is Float");
		} else {
            return Float.parseFloat(possibleFloat);
        }

    }

    public static String parseIp(String possibleIp) throws NotIpParsable{

        if (possibleIp.matches(ipPattern)) {
		    throw new NotIpParsable("The given Input is not IP Address");
		} else {
            return possibleIp;
        }

    }
}