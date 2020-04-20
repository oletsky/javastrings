package javatraining.oletsky.javastrings;

/**
 * @author O.Oletsky
 * A programmer intended to write a function to changing a string
 * But something went wrong
 */
public class FunctionNotChandesString {
    public static void main(String[] args) {
        String s="qwerty";
        change(s,"other");
        System.out.println(s); //other expected but qwerty got
    }

    static void change(String s, String value) {
        s=value;
    }
}
