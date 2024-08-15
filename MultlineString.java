/**
 * @author The Code Alchemist
 * from Chapter 1: Building Blocks, pages 32 - 33
 * multiline String example, also known as a text block
 * They make multiline STrings more readable and less prone to error
 */
public class MultlineString {
    public static void main(String[] args) {
        String eyeTest = """
                Hi there,
                have a look at this
                multiline String \
                the new line escape characters are implied here 
                """;
        System.out.println(eyeTest);
        String pyramid = """
                    *
                   * *
                  * * *   
                """;
        System.out.println(pyramid);

        // String nope = """will NOT compile!"""; // new line required after the opening """
    }
}
