package lab9.DictionaryTask.DictionaryUtils.Exceptions;

public class NoWordGivenException extends IllegalArgumentException {
    public NoWordGivenException() {
        super("No wrod Given");
    }

    public NoWordGivenException(String arg) {
        super(arg);
    }
}
