/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 351 - 352
 * Implicit modifiers of interfaces
 */
package beyond_classses;
// public abstract interface Soar   // abstract inserted implicitly
public interface Soar
{
    // int MAX_HEIGHT = 10;                         // implicitly equivalent to the next line
    public static final int MAX_HEIGHT = 10;

    // final static boolean UNDERWATER = true;      // implicitly equivalent to the next line
    public final static boolean UNDERWATER = true;

    // void fly(int speed);                         // implicitly equivalent to the next line
    public abstract void fly(int speed);

    // abstract void takeoff();                     // implicitly equivalent to the next line
    public abstract void takeoff();

    public abstract double dive();
}