package lab9.DictionaryTask.DictionaryUtils.Exceptions;

public class NotConvenienceLengthException extends IllegalArgumentException {
    public NotConvenienceLengthException() {
        super("The length of word is less than 2 letters");
    }

    public NotConvenienceLengthException(String arg) {
        super(arg);
    }
}
