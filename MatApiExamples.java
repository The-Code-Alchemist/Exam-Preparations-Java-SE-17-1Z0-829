/**
 * @author The Code Alchemist
 * Chapters 4: Core APIs, pages 190, 191, 192
 * min(a, b) and max(a, b) exists for int, long, float and double
 * round(a)
 */
public class MatApiExamples {
    public static void main(String[] args) {
        int first = Math.max(3, 7);
        System.out.println(first);

        int second = Math.min(7, -9);
        System.out.println(second);

        long low = Math.round(123.45);
        System.out.println(low);

        long high = Math.round(123.50);
        System.out.println(high);

        int fromFloat = Math.round(123.45f);
        System.out.println(fromFloat);

        double c = Math.ceil(Math.PI);
        System.out.println(c);

        double f = Math.floor(Math.PI);
        System.out.println(f);

        double exp = Math.pow(7, 2);
        System.out.println(exp);

        double random = Math.random();
        System.out.println(random);
    }
}
