package zoo;
/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 247, 293, 294
 */
public class Gorilla extends Animal {
    public Gorilla(int age) {
        super(age, "Gorilla");     // calls the first Animal constructor
    }
    public Gorilla() {
        super(5);                   // calls the second Animal constructor
    }

    public static int count;
    public static void addGorilla() { count++; }
    public void babyGorilla() { count++; }
    public void announceBabies() {
        addGorilla();
        babyGorilla();
    }
    public static void announceBabiesToEveryOne() {
        addGorilla();

        // Does NOT compile - a static method CANNOT call an instance method
//        babyGorilla();
    }
    public int total;
    public static int totally;


    // Does NOT compile non-static cannot be referenced by static context
//    public static double average = total / count;
    public double anotherAverage = totally / count;
}
