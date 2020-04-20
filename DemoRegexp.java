package javatraining.oletsky.javastrings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author O.Oletsky
 * Illustrating regular expressions
 */
public class DemoRegexp {
    public static void main(String[] args) {
        String regex = "Java";
        String input = "I love Java and other languages";
        Integer flags = null;
        Matcher matcher = getMatcher(regex, input, flags);
        if (matcher.find()) {
            System.out.println("Correct input");
        }
        else System.out.println("Incorrect input");
    }
    public static Matcher getMatcher(String regex, String input, Integer flags) {
        Pattern pattern;
        if (flags==null) pattern = Pattern.compile(regex);
        else pattern = Pattern.compile(regex, flags);
        Matcher matcher = pattern.matcher(input);
        return matcher;
    }

}
