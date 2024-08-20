/**
 * @author The Code Alchemist
 * from Chapter 2: Operators, page 70
 * Negation and bitwise complement operator examples
 */
package operators;
public class BooleanNegationExample {
    public static void main(String[] args) {
        boolean isAnimalAsleep = false;
        System.out.println(isAnimalAsleep);         // false
        isAnimalAsleep = !isAnimalAsleep;
        System.out.println(isAnimalAsleep);         // true

        int value = 3;                              // 0011
        System.out.println(value);
        int complement = ~value;                    // 1100
        System.out.println(complement);

        /**
         * In order to get the bitwise value of a variable
         * 1. Multiply by -1
         * 2. Subtract 1
         */
        System.out.println(-1 * complement - 1);    // 0011 equal to value
        System.out.println(-1 * value - 1);         // 1100 equal to complement

        // negation example
        double zooTemperature = 1.21;
        System.out.println(zooTemperature);         // 1.21
        zooTemperature = -zooTemperature;
        System.out.println(zooTemperature);         // -1.21
        zooTemperature = -(-zooTemperature);
        System.out.println(zooTemperature);         // -1.21




    }
}
