/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 253, 254
 * pass-by-value example
 */
package zoo;

public class AnotherDog {
    public static void main(String[] args) {
        var name = new StringBuilder("Webby");
        speak(name);
        System.out.println(name);   // WebbyGeorgette
    }

    private static void speak(StringBuilder s) {
        s.append("Georgette");      // Georgette gets appended to Webby
        System.out.println(s);      // WebbyGeorgette
    }
}