package lab9.DictionaryTask.DictionaryUtils.Exceptions;

public class NoWordsAvailableException extends Exception {

    public NoWordsAvailableException() {
        super("No words available.");
    }

    public NoWordsAvailableException(String message) {
        super(message);
    }
}
