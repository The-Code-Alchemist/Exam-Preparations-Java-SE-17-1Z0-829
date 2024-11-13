/**
 * @author The Code Alchemist
 * from Chapter 4: Core APIs, pages 172 - 173
 * StringBuilder append and chaining it
 */
package coreAPIs;
public class StringBuilderAppend {
    public static void main(String[] args) {

        var sb = new StringBuilder().append(1).append('c');
        System.out.println(sb);         // 1c
        sb.append("-").append(true);
        System.out.println(sb);         // 1c-true

        // all appends can be chained into a single assignment
        var anotherSb = new StringBuilder().append(1).append('c').append("-").append(true);
        System.out.println(anotherSb);  // 1c-true
    }
}
