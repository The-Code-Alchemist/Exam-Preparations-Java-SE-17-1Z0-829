/**
 * @author The Code Alchemist
 * from Chapter 1: Building Blocks, page 32
 * multiline String example, also known as a text block
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
    }
}
