/**
 * @author The Code Alchemist
 * from Chapter 4: Core APIs, pages 169 -170
 * Method Chaining: java allows methods to be called, one right after the other in a single statement
 */
package coreAPIs;
public class MethodChaningExamples {
    public static void main(String[] args) {

        // A series of String methods. Each time one is called, the returned type value is put in a new variable
        var start = "AniMaL     ";                                  // AniMal
        var trimmed = start.trim();                                 // AniMal
        var lowercase = trimmed.toLowerCase();                      // animal
        var result = lowercase.replace('a','A');    // AnimAl;
        System.out.println(result);                                 // AnimAl

        // this value of result is equivalent to the example above, except its value is assigned through method chaining
        result = "AniMaL    ".trim().toLowerCase().replace('a','A');
        System.out.println(result);                                 // AnimAl


        String a = "abc";
        String b = "abc".toUpperCase();                                             // ABC
        System.out.println(b);
        b = b.replace("B", "2").replace("C","3");  // ABC turns into A23
        System.out.println("a = " + a); // abc - a was never reassigned
        System.out.println("b = " + b); // A23
    }
}
