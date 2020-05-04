package javatraining.oletsky.javastrings;

/**
 * @author O.Oletsky
 * Typical operations with strings
 */
public class StringOperations {
    public static void main(String[] args) {
        String s = "abcadeafg";
        System.out.println(s.length()); //9
        System.out.println(s.charAt(1)); //b
        System.out.println(s.repeat(2)); //abcadeafgabcadeafg
        System.out.println(s.indexOf('a')); //0
        System.out.println(s.substring(2,6)); //cade
        System.out.println(s.equals("qwerty")); //false
        System.out.println(s.compareTo("abba")); //1
        System.out.println(s.concat("q")); //abcadeafgq

    }

}
