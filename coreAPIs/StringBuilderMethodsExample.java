/**
 * @author The Code Alchemist
 * from Chapter 4: Core APIs, page 172
 * Important StringBuilder methods for the exam
 */
package coreAPIs;
public class StringBuilderMethodsExample {
    public static void main(String[] args) {

        // common methods and indexes
        var sb = new StringBuilder("animals");
        int begin = sb.indexOf("a");
        System.out.println(begin);      // 0, first letter of animals
        int end = sb.indexOf("al");
        System.out.println(end);        // 4, stops at al (not included)
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));   // start at a, stop at the al substring
        System.out.println(sub);        // anim
        int len = sb.length();
        System.out.println(len);        // 7
        char ch = sb.charAt(6);
        System.out.println(ch);         // s
        System.out.println(sub + " " + len + " " + ch); // anim 7 s
    }
}
