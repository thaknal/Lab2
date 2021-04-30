package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.StringUtils;

public class StringFun {

    public static boolean isPalindrome(String tekst) {
        StringBuilder textToCompare = new StringBuilder();
        tekst = tekst.toLowerCase().trim();
        for (int i = 0; i < tekst.length(); i++) {
            if (Character.isWhitespace(tekst.charAt(i))) continue;
            textToCompare.append(tekst.charAt(i));
        }
        return textToCompare.toString().equals(textToCompare.reverse().toString());
    }
}