/**
 * @author The Code Alchemist
 * Chapter 5: Methods, pages 253 - 254
 * Java is a "pass-by-value" language: A copy of a variable is made and the method receives that copy.
 * Assignments made in the method do not affect the caller.
 */
package methods;

public class Dog {
    public static void main(String[] args) {
        var name = "Webby";
        speak(name);                // Georgette
        System.out.println(name);   // Webby - the name never changed
    }
    private static void speak(String name) {
        name = "Georgette";         // Georgette does not exist outside of this method, the caller is not affected
        System.out.println(name);   // Georgette gets printed first - method call on line 12
    }
}
