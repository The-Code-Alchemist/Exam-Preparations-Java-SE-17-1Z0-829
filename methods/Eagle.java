/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 258
 *
 * We can overload methods by changing anything in the parameter list by:
 * having more types
 * having the same types in a different order
 *
 * N.B. return type and access modifiers are inconsequential to overloading, line 14 will not compile
 * Only the method name and parameter list matter
 */
package methods;
public class Eagle {
    public void fly(int numMiles) {}
//    public int fly(int numMiles) {return  1;}     // will not compile, same parameter list
}
