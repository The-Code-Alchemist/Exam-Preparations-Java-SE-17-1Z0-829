/**
 * @author The Code Alchemist
 * from Chapter 4: Core APIs, pages 167 - 168
 * Formatting values can be done in a single method call, especially useful for logging purposes
 * public static String format(String format, Object args...)
 * public static String format(Locale loc, String format, Object args...)
 * public String formatted(Object args...)
 * Mixing data types may cause an exception at runtime
 */
package coreAPIs;
public class StringFormattingValues {
    public static void main(String[] args) {
        var name = "Kate";
        var orderId = 5;
        // All print: Hello Kate, order 5 is ready
        System.out.println("Hello " + name + ", order " + orderId + " is ready");
        System.out.println(String.format("Hello %s, order %d is ready", name, orderId));
        System.out.println("Hello %s, order %d is ready".formatted(name, orderId));

        name = "James";
        var score = 90.25;
        var total = 100;
        System.out.println("%s:%n   Score: %f out %d".formatted(name, score, total));

        var str = "Food: %d tons".formatted(2);
        System.out.println(str);

        // The following causes an IllegalFormatConversionException at runtime even if the variable str is not used
        // A floating-point number is used when an integer is expected
        str = "Food: %d tons".formatted(2.0);
    }
}
