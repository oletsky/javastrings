package javatraining.oletsky.javastrings;

/**
 * @autor O.Oletsky
 *
 * For comparison strings we should normally use equals()
 * rather than ==
 */
public class StringComparisons {
    public static void main(String[] args) {
        String s1 = "qw"+getString();
        String s2 = "qw"+getString();
        System.out.println(s1==s2); //false
        System.out.println(s1.equals(s2)); //true
    }

    static String getString() {
        return "erty";
    }
}
