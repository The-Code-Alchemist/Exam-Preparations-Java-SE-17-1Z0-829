/**
 * @author The Code Alchemist
 * from Chapter 5: Methods, pages 245 - 246
 * 
 * A static member cannot call an instance member without referencing an instance of the class
 */
package methods;
public class MantaRay {
    private String name = "Sammy";
    public static void first() {
        System.out.println("first");
    }
    public static void second() {
        System.out.println("second");
    }
    public void third() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        first();
        second();
//        third();  // instance method can't be called from a static method
    }
}
