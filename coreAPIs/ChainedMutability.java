/**
 * @author The Code Alchemist
 * from Chapter 4: Core APIs, pages 171 - 172
 * Chaining StringBuilder methods
 */
package coreAPIs;
public class ChainedMutability {
    public static void main(String[] args) {

        // The StringBuilder changes its own state and returns a reference to itself
        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle");
        System.out.println(sb);                 // start+middle
        StringBuilder same = sb.append("+end"); // add +end to the end of sb
        System.out.println(same);               // start+middle+end

        // sb and same point to the same object and print out the same value
        System.out.println(sb);                 // start+middle+end
        System.out.println(same);               // start+middle+end
        System.out.println(sb == same);         // true
        System.out.println(sb.equals(same));    // true


        StringBuilder a = new StringBuilder("abc");
        System.out.println(a);                  // abc
        StringBuilder b = a.append("de");
        System.out.println(b);                  // abcde
        System.out.println(a);                  // abcde


        // b refers to the same object as a refers to, assigning to variable b is redundant here which does absolutely nothing
        b = b.append("f").append("g");          // still referring to the same StringBuilder object

        // new StringBuilder() is called only once. There is only one StringBuilder object, so a and b are the same
        System.out.println("a=" + a);           // a=abcdefg
        System.out.println("b=" + b);           // b=abcdefg

        // There are 3 ways to construct a StringBuilder
        StringBuilder sb1 = new StringBuilder();            // empty sequence of characters
        StringBuilder sb2 = new StringBuilder("animal");    // value of animals assigned to the StringBuilder object
        StringBuilder sb3 = new StringBuilder(10);  // reserves a capacity i.e. a number of slots for characters
    }
}
