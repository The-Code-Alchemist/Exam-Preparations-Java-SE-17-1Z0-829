/**
 * @author The Code Alchemist
 * from Chapter 2: Operators, page 67
 * Operator precedence example
 */
package operators;
public class OperatorExample {
    public static void main(String[] args) {
        int cookies = 4;
        double reward = 3 + 2 * --cookies;

        /**
         * 1. cookies will be 3 of type int because of the pre-unary decrement
         * 2. 2 * 3 = 6 of type int
         * 3. 6 + 3 = 9 of type int
         * 9 = assigned to the variable reward and gets promoted to double
         */
        System.out.println("Zoo animal receives: " + reward + " reward points");
    }
}
