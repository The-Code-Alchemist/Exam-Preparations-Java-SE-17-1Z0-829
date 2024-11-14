/**
 * @author The Code Alchemist
 * from Chapter 4: Core APIs, pages 175 - 177
 * Equality
 * StringBuilder using the equals() method compares the reference equality.
 * Calling the toString() method on a StrinBuilder object will compare like a String object: a character by character
 * comparison
 */
package coreAPIs;
public class EqualityExample {
    public static void main(String[] args) {

        var one = new StringBuilder();
        var two = new StringBuilder();
        var three = one.append("a");
        System.out.println((one == two) + "\t one and two point to different StringBuilder objects");                        // false
        System.out.println((one == three) + "\t one and three point to the same StringBuilder object");                      // true

        var x = "Hello World";
        var y = "Hello World";                  // existing String of x is used for y, so they point to the same String object
        System.out.println((x == y) + "\t references are to the exact same object reference");                               // true
        var z = " Hello World".trim();
        System.out.println((x == z) + "\t they're different at compile-time, but equal in runtime");                         // false
        System.out.println((x.equals(z)) + "\t checks inside the String through a character by character comparison");       // true

        var name = "a";
        var builder = new StringBuilder("a");
//        System.out.println(name == builder);  // will not compile, references don't even point to the same object type, let alone the exact same object
        System.out.println((name == builder.toString()) + "\t The toString() method makes a comparison possible, though");   // false

        var singleString = "hello world";
        var concat = "hello ";
        concat += "world";      // += creates a new String
        System.out.println((singleString == concat) + "\t concat creates a new String");                                     // false
        System.out.println(singleString.equals(concat) + "\t a character by character comparison");                          // true

        var a = "Hello World";
        var b = new String("Hello World");  // asks to explicitly create a new String "Hello World"
        var c = "Hello World";
        System.out.println((a == b) + "\t b points a different, newly constructed String");                                  // false
        System.out.println(a.equals(b) + "\t a character by character comparison show the String objects are the same");     // true
        System.out.println((a == c) + "\t existing String is used to point to");                                             // true
    }
}
