/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 256
 * casting and autoboxing
 */
package class_design.zoo.primates;
public class AnotherGorilla {
    public void rest(Long x) {
        System.out.println("long");
    }
    public static void main(String[] args) {
        var g = new AnotherGorilla();
//        g.rest(8);    // will not compile - autoboxing and castng are done, but not simultaneously
        g.rest(8L);
        g.rest(Long.valueOf(8));
    }
}
