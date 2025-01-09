/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 247
 *
 * Both static and instance methods can refer to a static variable such as on line 10 and 11
 * An instance method can call a static method such as on lines 13 - 16
 *
 * A static method cannot call an instance method such as on line 23
 *
 * A static variable cannot use  an instance variable such as on line 24
 */
package methods;
public class Gorilla {
    public static int count;
    public static void addGorilla() { count++; }
    public void babyGorilla() { count++; }
    public void announceBabies() {
        addGorilla();
        babyGorilla();
    }
    public static void announceBabiesToEveryone() {
        addGorilla();

        // Does NOT compile - a static method CANNOT call an instance method
//      babyGorilla();  // Non-static method 'babyGorilla()' cannot be referenced from a static context
    }
    public int total;   // The next line will compile when total is made static
//  public static double average = total / count;
}
