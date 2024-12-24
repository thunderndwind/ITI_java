package lab7.StringReference.stringUtils;

import java.util.function.Function;

public class Validator {
    public static boolean isAlphbetOnly(String string1, Function<Character, Boolean> checker) {
        for (Character character : string1.toCharArray()) {
            if (!checker.apply(character)) {
                return false;
            }
        }
        return true;
    }
}
