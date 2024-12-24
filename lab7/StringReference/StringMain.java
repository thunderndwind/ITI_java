package lab7.StringReference;

import lab7.StringReference.stringUtils.Validator;;

public class StringMain {
    public static void main(String[] args) {
        String str1 = "tester";
        System.out.println(
                "String " + str1 + " is " + (Validator.isAlphbetOnly(str1, Character::isLetter) ? " Alphbet Only String"
                        : "not Alphbet Only String"));
    }
}
