package newfeatures;

public class LargeStrings {
    //Preview for Java 14
    public static void main(String[] args) {
        String markup = """
              <html>
                  <body>
                      <p>That's cool!</p>
                  </body>
              </html>
              """;
        System.out.printf(markup);
    }
}
