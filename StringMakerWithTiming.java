package javatraining.oletsky.javastrings;

/**
 * @author O.Oletsky
 * Different ways of creating strings from repeating fragments
 * with timing.
 * Don't use string concatenations for creating large strings!
 */
public class StringMakerWithTiming {
    public static void main(String[] args) {
        final String S = "a";
        final int N = 100000;
        long t1 = System.nanoTime();
        String res2 = makeStringByStringBuilder(N, S);
        long t2 = System.nanoTime();
        double elapsed1=(t2-t1)/1000.;
        long t3 = System.nanoTime();
        String res1 = makeStringByConcatenation(N, S);
        long t4 = System.nanoTime();
        double elapsed2=(t4-t3)/1000.;
        long t5 = System.nanoTime();
        String res3 = makeStringByRepeat(N, S);
        long t6 = System.nanoTime();
        double elapsed3=(t6-t5)/1000.;
        System.out.printf("Time for StringBuilder: %8.4f mks\n",elapsed1);
        System.out.printf("Time for concatenation: %8.4f mks\n",elapsed2);
        System.out.printf("Time for String.repeat: %8.4f mks\n",elapsed3);
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

