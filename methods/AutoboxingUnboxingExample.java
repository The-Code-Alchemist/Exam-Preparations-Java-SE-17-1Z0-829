/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 256
 * Autoboxing and Unboxing
 */
package methods;
public class AutoboxingUnboxingExample {
    public static void main(String[] args) {
        int primitiveInteger = 5;
        Integer integerObject = primitiveInteger;   // autoboxing
        System.out.println(integerObject + primitiveInteger);
        int anotherPrimitiveInteger = integerObject + primitiveInteger;
        System.out.println(anotherPrimitiveInteger);
    }
}