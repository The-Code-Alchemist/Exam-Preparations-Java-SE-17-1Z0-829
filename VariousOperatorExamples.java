/**
 * @author The Code Alchemist
 * from Chapter 2: Operators, page 71, 72, 73, 74, 75
 * Operator examples increment, decrement and binary operators
 */
public class VariousOperatorExamples {
    public static void main(String[] args) {

        // increments and decrements
        int parkAttendance = 0;
        System.out.println(parkAttendance);     // 0
        System.out.println(++parkAttendance);   // 1
        System.out.println(parkAttendance);     // 1
        System.out.println(parkAttendance--);   // 1
        System.out.println(parkAttendance);     // 0

        // operator precedence
        int price = 2 * 5 + 3 * 4 - 8;          // 10 + 12 - 8 = 14
        System.out.println(price);
        price = 2 * ((5 + 3) * 4 - 8);          // 2 * (8 * 4 - 8) = 2 * (32 - 8) = 2 * 24 = 48
        System.out.println(price);

        // division and modulus
        System.out.println(9/3);                // 3
        System.out.println(9%3);                // 0
        System.out.println(10/3);               // 3
        System.out.println(10%3);               // 1
        System.out.println(11/3);               // 3
        System.out.println(11%3);               // 2
        System.out.println(12/3);               // 4
        System.out.println(12%3);               // 0
    }
}
