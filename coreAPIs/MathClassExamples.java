/**
 * @author The Code Alchemist
 * Chapters 4: Core APIs, pages 190 - 192
 * Calculation examples with Math APIs
 * The class java.lang.Math is used in the examples
 */
package coreAPIs;
public class MathClassExamples {
    public static void main(String[] args) {
        // minimum and maximum
        int first = Math.max(3, 7);                 // 7
        int second = Math.min(7, -9);               // -9
        System.out.println(first+second);           // -2, the sum of first and second

        // rounding numbers
        long low = Math.round(123.45);              // 123
        long high = Math.round(123.50);             // 124
        int fromFloat = Math.round(123.45f);        // 123
        System.out.println(low + high + fromFloat); // 370, the sum of low, high and fromFloat after their round off

        // ceiling and floor
        double c = Math.ceil(3.14);                 // 4.0 rounds up to the next whole number
        double f = Math.floor(3.14);                // 3.0 any values after the decimal are discarded
        System.out.println(c - f);                  // 1.0

        // calculating exponents
        double squared = Math.pow(5, 2);            // base: 5, exponent: 2
        System.out.println(squared);                // 5 ^ 2 = 25.0

        // random numbers
        double num = Math.random();                 // any random number where 0 <= num < 1.0
        System.out.println(num);
    }
}
