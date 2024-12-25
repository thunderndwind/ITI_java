package lab9.DictionaryTask.DictionaryUtils.Exceptions;

public class EmptyDictionaryException extends Exception {
    public EmptyDictionaryException() {
        super("Dictionary is empty");
    }

    public EmptyDictionaryException(String arg) {
        super(arg);
    }
}
