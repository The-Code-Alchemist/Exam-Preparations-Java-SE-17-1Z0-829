/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 256
 * Autoboxing and Unboxing
 * Arithmetic operations i.e. calculations can be performed using Integer Objects and their primitive counterparts together
 */
package methods;
public class AutoboxingUnboxingExample {
    public static void main(String[] args) {
        int primitiveInteger = 5;
        System.out.println(primitiveInteger);                           // 5 primitive integer

        Integer integerObject = Integer.valueOf(primitiveInteger);      // Autoboxing:  primitive int converted to Integer object
        System.out.println(integerObject);                              // 5 Integer object

        int anotherPrimitiveInteger = integerObject.intValue();         // Unboxing:    Integer object converted primitive int
        System.out.println(anotherPrimitiveInteger);                    // 5 primitive integer

        // The sum of an Integer Object and a primitive int value added and stored as a primitive int
        anotherPrimitiveInteger = integerObject + primitiveInteger;
        System.out.println(anotherPrimitiveInteger);                    // 10

        // The sum of an Integer Object and a primitive int value added and stored as an Integer Object
        Integer anotherIntegerObject = Integer.valueOf(integerObject + primitiveInteger);
        System.out.println(anotherIntegerObject);                       // 10
    }
}