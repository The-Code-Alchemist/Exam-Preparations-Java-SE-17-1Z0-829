/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 261-262
 * overloading primitive types
 */
package zoo;
public class Ostrich {
    public void fly(int i) {
        System.out.print("int");
    }
    public void fly(long l) {
        System.out.print("long");
    }
    public static void main(String[] args) {
        var p = new Ostrich();
        p.fly(123);
        System.out.print("-");
        p.fly(123L);
    }
}
