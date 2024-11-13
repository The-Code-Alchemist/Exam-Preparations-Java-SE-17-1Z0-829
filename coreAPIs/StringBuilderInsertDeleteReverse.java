/**
 * @author The Code Alchemist
 * from Chapter 4: Core APIs, pages 173 - 175
 *
 * The insert method adds characters to the StringBuilder at the requested index and returns a reference to the current
 * StringBuilder
 *
 * The delete method does the opposite and removes characters from the sequence and returns areference to the current
 * StringBuilder
 *
 * The replace method replaces specific parts of the StringBuilder object
 *
 * The reverse method reverses the contents of the StringBuilder object
 */
package coreAPIs;
public class StringBuilderInsertDeleteReverse {
    public static void main(String[] args) {
        insertToStringBuilder();
        deleteFromStringBuilder();
        replaceInStringBuilder();
    }

    private static void insertToStringBuilder() {
        var sb = new StringBuilder("animals");
        sb.insert(7, "-");  // animals-
        System.out.println(sb);
        sb.insert(0, "-");  // -animals-
        System.out.println(sb);
        sb.insert(4, "-");  // -ani-mals-
        System.out.println(sb);
    }

    private static void deleteFromStringBuilder() {
        var sb = new StringBuilder("abcdef");
        System.out.println(sb);     // abcdef
        sb.delete(1, 3);            // deletes characters starting at index 1: b and ending right before index 3: d (not included)
        System.out.println(sb);     // adef
        sb.deleteCharAt(3);
        System.out.println(sb);     // ade
//        sb.deleteCharAt(4);  // java.lang.StringIndexOutOfBoundsException: index 4, length 3
    }

    private static void replaceInStringBuilder() {
        var builder = new StringBuilder("pigeon dirty");
        System.out.println(builder);    // pigeon dirty
        builder.replace(3, 6, "sty dirty");
        System.out.println(builder);    // pigsty dirty
        builder.replace(3, 100, "");
        System.out.println(builder);    // pig - everything after pig gets replaced by a
        builder.reverse();
        System.out.println(builder);    // gip
    }
}
