package pond;

public class Snake {
    public static long hiss = 2;

    public static void main(String[] args) {
        System.out.println(Snake.hiss); // class name is used instead of instance name when using static members

        Snake s = new Snake();
        System.out.println(s.hiss);     // s is a snake
        s = null;
        System.out.println(s.hiss);     // s is still a snake

        Snake.hiss = 4;
        System.out.println(s.hiss);
        Snake snake1 = new Snake();
        Snake snake2 = new Snake();
        snake1.hiss = 6;
        snake2.hiss = 5;
        System.out.println(Snake.hiss);
    }
}
