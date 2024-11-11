/**
 * @author The Code Alchemist
 * from Chapter 4: Core APIs, pages 167 - 168
 * Escape sequences are used by added backslashes \
 */
package coreAPIs;
public class EscapeSequences {
    public static void main(String[] args) {

        var str = "1\\t2";
        System.out.println(str);    // 1\t2
        str = "1\t2";
        System.out.println(str);    // 1    2

        // turnss escape literals such as \t and turn them into the equivalent escape sequences
        System.out.println(str.translateEscapes());     // 1    2
    }
}
