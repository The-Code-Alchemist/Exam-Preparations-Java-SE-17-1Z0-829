/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 260-261
 * Overloading primitive types
 * If the method with the int parameter were to be commented out or removed,
 * an overloaded method with a wider data type is called such as a long
 */
package methods;
public class Ostrich {
    public void fly(int i) {
        System.out.print("int");
    }
    public void fly(long l) {
        System.out.print("long");
    }
    public static void main(String[] args) {
        // output: int-long
        // remove the fly method with the int parameter on line 8 and the input becomes: long-long
        var p = new Ostrich();
        p.fly(123);     // method with the int parameter is called, an exact match
        System.out.print("-");
        p.fly(123L);    // method with the long parameter is called, an exact match
    }
}
