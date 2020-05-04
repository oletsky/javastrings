package javatraining.oletsky.javastrings;

/**
 * @author O.Oletsky
 * Different ways of creating strings
 */
public class CreatingStrings {
    public static void main(String[] args) {
        String s1="String 1"; //Literal creating
        String s2 = new String("String 2");//From literal
        String s3 = new String(new char[] { //From char array
         'S','t','r','i','n','g',' ','3'
        }
        );
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
