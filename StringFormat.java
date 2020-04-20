package javatraining.oletsky.javastrings;

/**
 * Illustrates String.format
 */
public class StringFormat {
    public static void main(String[] args) {
        System.out.print(formatNumberOutput("pi", Math.PI));
        System.out.print(formatNumberOutput("e", Math.E));
    }

    static String formatNumberOutput(String s, double v) {
        return String.format("%s = %10.8f\n", s, v);
    }
}
