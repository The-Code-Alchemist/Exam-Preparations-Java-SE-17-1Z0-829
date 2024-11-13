/**
 * @author The Code Alchemist
 * from Chapter 4: Core APIs, pages 170 - 171
 * A small program can create a lot of java.lang.String objects very quickly
 * The java.lang.StringBuilder object can be reused, which is less strenuous on the heap
 */
package coreAPIs;
public class StringBuilderExample {
    public static void main(String[] args) {

        // A total of 27 String objects are created, because String objects are immutable.
        // This is inefficient for the heap, because 26 of them are eligible for garbage collection
        String alpha = "";
        for(char current = 'a'; current <= 'z'; current++) {
            alpha += current;
        }
        System.out.println(alpha);

        // The StringBuilder object is mutable and can be reused, creating only one StringBuilder object is sufficient
        StringBuilder beta = new StringBuilder();
        for (char current = 'a'; current <= 'z' ; current++) {
            beta.append(current);
        }
        System.out.println(beta);
    }
}
