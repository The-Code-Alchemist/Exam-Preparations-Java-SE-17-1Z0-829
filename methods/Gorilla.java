/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 247
 *
 *
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
//      babyGorilla();  // Non-static method 'babyGorilla()' cannot be referenced from a static context
    }
    public int total;
//  public static double average = total / count;   // will compile when total on the previous line is made static
}
