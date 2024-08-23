/**
 * @author The Code Alchemist
 * from Chapter 3: Making Decisions, page 121, 122, 123,124, 125, 126, 127, 128, 129
 * loop examples: while, do-while, for, for-each
 */
package making_decisions;
public class LoopExamples {
    public static void main(String[] args) {

        int counter = 0;
        while (counter < 10) {
            double price = counter * 10;
            System.out.println(price);
            counter++;
        }
        eatCheese(4);
        eatingExample();
        eatingMore();
        eatingMuchMore();
    }

    static int roomInBelly = 5;
    public static void eatCheese(int bitesOfCheese) {
        while (bitesOfCheese > 0 && roomInBelly > 0) {
            bitesOfCheese--;
            roomInBelly--;
        }
        System.out.println(bitesOfCheese + " pieces of cheese left");
        System.out.println(roomInBelly + " room in belly left");
    }

    public static void eatingExample() {
        int full = 5;
        while(full < 5) {
            System.out.println("Not full!");
            full++;
        }
    }

    public static void eatingMore() {
        int lizard = 0;
        do {
            lizard++;
            System.out.println("eating at least once!");
        } while (false);
        System.out.println(lizard);

        int pen = 2;
        int pigs = 5;
        while(pen < 10) {
            pigs++;
            pen++;
            System.out.println("this loop keeps going forever if pen gets no increment");
        }
    }

    int i, j;
    public static void eatingMuchMore() {

        for(int i = 0, j = 9, k = 1,  l = 5; i < 10 && j > 0; ++i, --j, k *= 2) {
            System.out.println(i + " " + j + " " + k);
        }

        System.out.println("");

        for(var k = 5; k > 0; k--) {
            System.out.print(k + " ");
        }

        int[] count = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum  = 0;
        for(long current :count) {
            sum += current;
            System.out.print(" " + sum + " ");
        }
        System.out.println(sum); // only print the last value of sum
    }
}