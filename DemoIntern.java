package javatraining.oletsky.javastrings;

/**
 * @author O.Oletsky
 * Demonstrating use of intern()
 */
public class DemoIntern {
    public static void main(String[] args) {
        String s1 = "qwerty";
        String s2 = "qw" + getString();
        String s3 = s2.intern();
        System.out.println(s1 == s2); //false
        System.out.println(s1==s3); //true
    }

    static String getString() {
        return "erty";
    }

}
