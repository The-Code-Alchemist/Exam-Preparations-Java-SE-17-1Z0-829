/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 254
 *
 * The variable s on line 17 is a copy of the variable name on line 12, still using a pass-by-value
 * "pass-by-reference": name and s both point to the same StringBuilder Object, so changes made are available to both references
 */
package methods;

public class AnotherDog {
    public static void main(String[] args) {
        var name = new StringBuilder("Webby");
        speak(name);                // Georgette
        System.out.println(name);   // WebbyGeorgette - Georgette is appended to Webby on the same StringBuilder Object
    }
    private static void speak(StringBuilder s) {
        s.append("Georgette");      // Georgette is appended to Webby on the same StringBuilder Object
    }
}
