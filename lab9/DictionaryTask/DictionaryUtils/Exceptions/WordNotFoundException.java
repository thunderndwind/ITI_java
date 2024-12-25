package lab9.DictionaryTask.DictionaryUtils.Exceptions;

public class WordNotFoundException extends Exception {

    public WordNotFoundException() {
        super("Word not found.");
    }

    public WordNotFoundException(String message) {
        super(message);
    }
}
