package javatraining.oletsky.javastrings;

/**
 * @author O.Oletsky
 *
 * Putting literals in String.equals first
 * you reduce chance of getting NullPointerException
 */
public class StringEqualsOrder {
    public static void main(String[] args) {
        String s=null;
        boolean b;
        try {
            b=s.equals("qwerty");
        }
        catch (NullPointerException npe) {
            System.out.println("You should have done this before");
            b="qwerty".equals(s);
        }
        System.out.println(b);
    }

}
