package javatraining.oletsky.javastrings;

import java.util.Arrays;

/**
 * @author O.Oletsky
 * Sorting a string
 * Try to find other ways
 */
public class SortTheString {
    public static void main(String[] args) {
        System.out.println(sortString("abrakadabra"));
    }

    static String sortString(final String s) {
        char[] chArr = s.toCharArray();
        Arrays.sort(chArr);
        return new String(chArr);
    }
}
