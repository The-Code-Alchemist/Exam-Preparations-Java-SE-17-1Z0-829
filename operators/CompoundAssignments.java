/**
 * @author The Code Alchemist
 * from Chapter 2: Compound Assignment Operators, pages 81, 82, 86
 * Compound assignment examples
 */
package operators;
public class CompoundAssignments {
    public static void main(String[] args) {
        int camel = 2, giraffe = 3;

        // The following assignment operators perform the same calculation
        camel = camel * giraffe;    // Simple assignment operators
        System.out.println(camel);
        camel *= giraffe;           // Compound assignment operator
        System.out.println(camel);

        long goat = 10;
        int sheep = 5;
        // sheep = sheep * goat;    // will not compile
        sheep *= goat;              // Compiles fine, because of automatic promotion to the long datatype. Casts to int at the end
        System.out.println(sheep);

        // an assignment within an assignment is allowed
        long wolf = 5;
        System.out.println(wolf);
        long coyote = (wolf = 3);
        System.out.println(coyote);
        System.out.println(wolf);

        // Only one object is created: all three reference point to this object
        Integer zooTime = Integer.valueOf(9);
        Number num = zooTime;
        Object obj = zooTime;

        System.out.println(zooTime);
        System.out.println(num);
        System.out.println(obj);
    }
}