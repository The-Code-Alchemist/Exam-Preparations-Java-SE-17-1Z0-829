/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 253, 254
 * pass-by-value example
 */
package zoo;

public class Dog {
    public static void main(String[] args) {
        var name = "Webby";
        speak(name);
        System.out.println(name);   // Webby never changed
    }
    private static void speak(String name) {
        name = "Georgette";
        System.out.println(name);   // printed first
    }
}
