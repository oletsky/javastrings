package javatraining.oletsky.javastrings;

/**
 * @author O.Oletsky
 * Different ways of creating strings from repeating fragments
 */
public class StringMaker {
    public static void main(String[] args) {
        final String S = "a";
        final int N = 5;
        String res1 = makeStringByConcatenation(N, S);
        String res2 = makeStringByStringBuilder(N, S);
        String res3 = makeStringByRepeat(N, S);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }

    static String makeStringByStringBuilder(int n, String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }

    static String makeStringByConcatenation(int n, String s) {
        String res = "";

        for (int i = 1; i <= n; i++) {
            res += s;
        }
        return res;
    }

    static public String makeStringByRepeat(int n, String s) {
        return s.repeat(n);
    }
}
