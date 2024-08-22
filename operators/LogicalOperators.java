/**
 * @author The Code Alchemist
 * from Chapter 2: Compound Assignment Operators, pages 88
 * Logical operator examples with short-circuit (inclusive) operators
 */
package operators;
public class LogicalOperators {
    public static void main(String[] args) {
        boolean eyesClosed = true;
        boolean breathingSlowly = true;

        boolean resting = eyesClosed | breathingSlowly;
        System.out.println(resting);
        boolean asleep  = eyesClosed & breathingSlowly;
        System.out.println(asleep);
        boolean awake   = eyesClosed ^ breathingSlowly;
        System.out.println(awake);  // will be true if one of the operands is false

        int rabbit      = 6;
        boolean bunny   = (rabbit >= 6) || (++rabbit <=7);  // increment on right side not executed
        System.out.println(rabbit);                         // 6
    }
}