/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 248
 */
public class Counter {
    private static int count;   // default value is 0 if not initialized
    public Counter() // default constructor
    {
        count++;
    }
    public static void main(String[] args) {
        // count incremented by 1 each time the constructor is called
        Counter counter1 = new Counter();
        System.out.println(count);
        Counter counter2 = new Counter();
        System.out.println(count);
        Counter counter3 = new Counter();
        System.out.println(count);

    }
}
