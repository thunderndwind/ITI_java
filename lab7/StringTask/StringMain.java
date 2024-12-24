package lab7.StringTask;

import lab7.StringTask.stringUtils.StringUtils;

public class StringMain {
    public static void main(String[] args) {
        String str1 = "test";
        String str2 = "tester";
        String longer = StringUtils.betterString(str1, str2, (s1, s2) -> s1.length() > s2.length());
        String first = StringUtils.betterString(str1, str2, (s1, s2) -> true);
        System.out.println("longer String : " + longer + " \nfirst: " + first);
    }
}
