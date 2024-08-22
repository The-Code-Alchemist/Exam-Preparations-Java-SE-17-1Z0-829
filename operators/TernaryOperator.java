/**
 * @author The Code Alchemist
 * from Chapter 2:  Operators, pages 90-92
 * Ternary operator examples
 */
package operators;
public class TernaryOperator {
    public static void main(String[] args) {
        int owl = 5;
        int food;
        if(owl<2) {
            food = 3;
        } else {
            food = 4;
        }
        System.out.println(food);   // owl >= 2, food = 4

        // The ternary operator statement is equivalent to the if-else statement above
        food = owl < 2 ? 3 : 4;

        // food1 and food2 have the same value. food2 is expressed more clearly, because of the additional parentheses
        int food1 = owl < 4 ? owl > 2 ? 3 : 4 : 5;
        System.out.println(food1);
        int food2 = (owl < 4 ? ((owl > 2) ? 3 : 4) : 5);
        System.out.println(food2);
    }
}
