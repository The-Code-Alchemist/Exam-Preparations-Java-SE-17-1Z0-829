/**
 * @author The Code Alchemist
 * from Chapter 4: Core APIs, page 157, 158, 159, 160, 161, 162, 163, 166, 167, 171, 172, 173, 174, 175, 176,
 * += compounds the String concatenation
 */
public class StringConcatenationAndMethodExamples {
    public static void main(String[] args) {
        System.out.println(1 + 2);          // 3
        System.out.println("a" + "b");      // ab
        System.out.println("a" + "b" + 3);  // ab3
        System.out.println(1 + 2 + "c");    // 3c
        System.out.println("c" + 1 + 2);    // c12
        System.out.println(("c" + null));   // cnull

        var s = "1";
        s += "2";
        s += 3;
        System.out.println(s);

        // Let's look at some methods from the String class
        var name = "animals";                   // inferred as a String
        System.out.println(name.length());      // shows the length of a String where an int is returned: 7
        System.out.println(name.length() + 2l); // aritmetic can be performed on the returned int: 7 + 2 = 9

        System.out.println(name.charAt(0));     // first character of the variable name is shown
        System.out.println(name.charAt(6));     // second character of the variable name is shown
//        System.out.println(name.charAt(-1));  // StringIndexOutOfBoundsException also terminates the program

        System.out.println(name.indexOf('a'));
        System.out.println(name.indexOf("al"));
        System.out.println(name.indexOf('a', 4));
        System.out.println(name.indexOf("al", 5));

        System.out.println(name.substring(3));         // mals
        System.out.println(name.substring(name.indexOf('m')));  // mals
        System.out.println(name.substring(3, 4));               // m, stops at the 5th character which is NOT included
        System.out.println(name.substring(3, 7));               // mals, stops at the 8th character - which is OUT OF BOUNDS

        System.out.println(name.substring(3, 3));               // empty substring
//        System.out.println(name.substring(3, 2));             // java.lang.StringIndexOutOfBoundsException: begin 3, end 2, length 7       also terminates the program
//        System.out.println(name.substring(3, 8));             // S// java.lang.StringIndexOutOfBoundsException: begin 3, end 8, length 7       also terminates the program

        System.out.println(name.toUpperCase());                 // ANIMALS
        System.out.println("ABC123".toLowerCase());             // abc123

        System.out.println("abc".equals("ABC"));                        // false
        System.out.println("ABC".equals("ABC"));                        // true
        System.out.println("abc".equalsIgnoreCase("ABC"));   // true

        System.out.println("abc".startsWith("a"));              // true
        System.out.println("abc".startsWith("A"));              // false - case does not match

        System.out.println("abc".endsWith("c"));                // true
        System.out.println("abc".endsWith("a"));                // false

        System.out.println("abc".contains("b"));                // true
        System.out.println("abc".contains("8"));                // false

        System.out.println("abcabc".replace('a', 'A'));                  // AbcAbc char can't be left blank
        System.out.println("abcabc".replace("a", "A"));                 // AbcAbc CharSequence CAN be left blank
        System.out.println("abcabc".replace("", "3"));                  // AbcAbc CharSequence CAN be left blank
        System.out.println("abcabc".replace("", "3").toUpperCase());    // AbcAbc CharSequence CAN ben left blank

        char character = '\u2000';     // space

        System.out.println("abc".strip());                      // abc
        System.out.println("\t  a b c\n".strip());              // a b c

        String text = " abc\t ";                                // \t is a single character
        System.out.println(text.trim().length());               // 3
        System.out.println(text.strip().length());              // 3
        System.out.println(text.stripLeading().length());       // 5
        System.out.println(text.stripTrailing().length());      // 4

        int iVal = 100;
        String sVal = String.valueOf(iVal);

        int i = 2, j = 3;
        int results = i * j;
        // Concatenation happens automatically
        String output = i + " * " + j + " = " + results;
        System.out.println(output);

        var block = """
                  a
                   b
                  c""";
        var concatenation = " a\n"
                + "  b\n"
                + " c";
        System.out.println(block.length());
        System.out.println(concatenation.length());
        System.out.println(block.indent(1).length());
        System.out.println(concatenation.indent(-1).length());
        System.out.println(concatenation.indent(-4).length());
        System.out.println(concatenation.stripIndent().length());

        var str = "1\\t2";
        System.out.println(str);
        System.out.println(str.translateEscapes());

        System.out.println(" ".isEmpty());  // false
        System.out.println("".isEmpty());   // true
        System.out.println(" ".isBlank());  // true
        System.out.println("".isBlank());   // true, there are only whitespaces

        String location = "Florida";
        int FlightNumber = 175;
        StringBuilder stringBuilder = new StringBuilder(40);
        stringBuilder.append("I flew to ");
        stringBuilder.append(location);
        stringBuilder.append(" on Flight #");
        stringBuilder.append(FlightNumber);    // is converted to String by concatenating
        String message = stringBuilder.toString();
        System.out.println(message);

        String time = "09:00";
        int pos = stringBuilder.indexOf(" on");
        stringBuilder.insert(pos, " at ");     // 4 characters
        stringBuilder.insert(pos + 4, time);
        message = stringBuilder.toString();
        System.out.println(message);
        System.out.println(stringBuilder);

        var start = "AniMaL     ";              // AniMal
        var trimmed = start.trim();             // AniMal
        var lowercase = trimmed.toLowerCase();  // animal
        var result = lowercase.replace('a','A'); // AnimAl;
        System.out.println(result);             // AnimAl

        var anotherStart = "AniMaL    ".trim().toLowerCase().replace('a','A');
        System.out.println(anotherStart);       // AnimAl

        String alpha = "";
        for(char current = 'a'; current <= 'z'; current++) {
            alpha += current;
        }
        System.out.println(alpha);

        StringBuilder beta = new StringBuilder();
        for (char current = 'a'; current <= 'z' ; current++) {
            beta.append(current);
        }
        System.out.println(beta);

        StringBuilder a = new StringBuilder("abc");
        System.out.println(a);
        StringBuilder b = a.append("de");
        System.out.println(b);
        // b refers to the same object as a refers to
        b = b.append("f").append("g"); // assigning to variable b is redundant here
        // new StringBuilder() is called only once, a and b are the same
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        // There are 3 ways to construct a StringBuilder
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("animal");
        StringBuilder sb3 = new StringBuilder(10);

        var sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));   // sub =  anim
        int len = sb.length();  // 7
        char ch = sb.charAt(6); // s
        System.out.println(sub + " " + len + " " + ch); // anim 7 s

        var anotherStringBuilder = new StringBuilder("animals");
        anotherStringBuilder.insert(7, "-");
        System.out.println(anotherStringBuilder);
        anotherStringBuilder.insert(0, "-");
        System.out.println(anotherStringBuilder);
        anotherStringBuilder.insert(4, "-");
        System.out.println(anotherStringBuilder);

        var sbDeleteExample = new StringBuilder("abcdef");
        System.out.println(sbDeleteExample);    // abcdef
        sbDeleteExample.delete(1, 3);
        System.out.println(sbDeleteExample);    // adef
        sbDeleteExample.deleteCharAt(3);
        System.out.println(sbDeleteExample);    // ade
//        sbDeleteExample.deleteCharAt(4);  // java.lang.StringIndexOutOfBoundsException: index 4, length 3

        var builder = new StringBuilder("pigeon dirty");
        System.out.println(builder);    // pigeon dirty
        builder.replace(3, 6, "sty dirty");
        System.out.println(builder);    // pigsty dirty
        builder.replace(3, 100, "");
        System.out.println(builder);    // pig - everything after pig gets replaced
        builder.reverse();
        System.out.println(builder);    // gip

        var x = "Hello World";
        var y = "Hello World";
        System.out.println(x == y);     // true references are to the exact same object reference
        var z = " Hello World".trim();
        System.out.println(x == z);     // false, they're different at compile-time, but equal in runtime

        var singleString = "hello world";
        var concat = "hello ";
        concat += "world";
        System.out.println(singleString == concat); // false, concat creates a new String

        var nameExample = "Hello World";
        var anotherNameExample = new String("Hello World").intern();
        System.out.println(nameExample == anotherNameExample);

        System.out.println("Fluffy" == new String("Fluffy").intern());  // true

        var first = "rat" + 1;                                          // gets placed in the String pool as "rat1"
        var second = "r" + "a" + "t" + "1";                             // reference points to the same "rat1" String in the String pool
        var third = "r" + "a" + "t" + new String(String.valueOf(1));  // a new String created by the constructor which does not point to a reference
        System.out.println(first == second);                            // true, they share the same String pool reference (at compile time)
        System.out.println(first == second.intern());                   // true, reference is the same
        System.out.println(first == third);                             // false, the new String creates a new reference
        System.out.println(first == third.intern());                    // true, point to the same String "rat1"

    }
}
