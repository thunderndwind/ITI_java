package lab7.StringTask.stringUtils;

import java.util.function.BiFunction;

public class StringUtils {
    public static String betterString(String string1, String string2, BiFunction<String, String, Boolean> filter) {
        return filter.apply(string1, string2) ? string1 : string2;
    }
}
