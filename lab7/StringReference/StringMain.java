package lab7.StringReference;

import lab7.StringReference.stringUtils.Validator;;

public class StringMain {
    public static void main(String[] args) {
        String str1 = "tesd2321ter";

        // System.out.println(
        // "String " + str1 + " is " + (Validator.isAlphbetOnly(str1,
        // Character::isLetter) ? " Alphbet Only String"
        // : "not Alphbet Only String"));

        System.out.println(
                "String " + str1 + " is " + (Validator.isAlphbetOnly(str1, (c) -> {
                    if ((c > 'a' && c < 'z') || (c > 'A' && c < 'Z'))
                        return true;
                    return false;
                }) ? " Alphbet Only String"
                        : "not Alphbet Only String"));
    }
}
