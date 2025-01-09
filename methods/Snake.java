/**
 * @author The Code Alchemist
 * from Chapter 5: Methods, pages 244 - 245
 *
 * Put the class name before the method or variable to use that member. Refer to Snake.hiss on line 13
 * You can use an instance of an object to call a static method.
 */
package methods;
public class Snake {
    public static long hiss = 2;

    public static void main(String[] args) {
        System.out.println(Snake.hiss); // 2 - class name is used instead of instance name when using static members

        Snake s = new Snake();
        System.out.println(s.hiss);     // 2 - s is a Snake

        s = null;
        System.out.println(s.hiss);     // 2 - s is still a Snake, it doesn't matter if s becomes null

        System.out.println(hiss);       // 2 - we are already in the snake class, using hiss alone will do

        Snake.hiss = 4;
        System.out.println(Snake.hiss);

        Snake snake1 = new Snake();
        Snake snake2 = new Snake();
        snake1.hiss = 6;
        snake2.hiss = 5;

        // The output is the same when a static variable is used - 5, because of the latest reassignment on line 29
        // All the snake variables are a distraction
        System.out.println(Snake.hiss);     // 5
        System.out.println(snake1.hiss);    // 5
        System.out.println(snake2.hiss);    // 5
    }
}
