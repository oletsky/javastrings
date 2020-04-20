package javatraining.oletsky.javastrings;

/**
 * @autor O.Oletsky
 * Two ways of getting strings from primitive values
 * Explore how effective are these ways
 */
public class StringFromPrimitive {
    public static void main(String[] args) {
        int a = 2;
        String s1=""+a;
        System.out.println(s1);
        String s2=String.valueOf(a);
        System.out.println();
    }
}
