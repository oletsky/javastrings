package javatraining.oletsky.javastrings;

/**
 * @author O.Oletsky
 * Illustrating comparisons of strings
 * Literal strings vs new String()
 */

public class LiteralStringsVsConstructor {
    public static void main(String[] args) {
        //Literal strings get to the pool
        String s1="qwerty";
        String s2="qwerty";
        System.out.println(s1==s2); //true

        //Strings created via constructor don't
        String s3=new String("otherqwerty");
        String s4=new String("otherqwerty");
        System.out.println(s3==s4); //false
    }
}
