/**
 * @author The Code Alchemist
 * from Chapter 4: Core APIs, pages 167 - 168
 * Formatting values can be done in a single method call, especially useful for logging purposes
 * public static String format(String format, Object args...)
 * public static String format(Locale loc, String format, Object args...)
 * public String formatted(Object args...)
 * The formatting can be used with optinal flags
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
        // str = "Food: %d tons".formatted(2.0);     // uncomment this line to reproduce the runtime exception

        // example of String format with flags
        var pi = 3.14159265359;
        System.out.format("[%f]", pi);      // [3.141593]       - default
        System.out.format("[%12.8f]", pi);  // [  3.14159265]   - 12 characters in total, 8 decimal round off whitespace in front of 3
        System.out.format("[%012f]", pi);   // [00003.141593]   - default with 12 characters in total, 0s in front of 3
        System.out.format("[%12.2f]", pi);  // [        3.14]   - 12 characters in total, 2 decimal round off whitespace in front of 3
        System.out.format("[%.3f]", pi);    // [3.142]          - 3 decimal round off

        // The real value of pi in Java
        System.out.println("The real value of Pi in Java: " + Math.PI);
    }
}
