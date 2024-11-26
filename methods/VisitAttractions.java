/**
 * @author The Code Alchemist
 * from Chapter 5: Methods, page 233
 * Some methods with vararg parameters
 * A method can at most have one vararg parameter passed to it, the last one. Otherwise the method will not compile.
 */
package methods;
public class VisitAttractions {
    public void walk1(int... steps) {}
    public void walk2(int start, int... steps) {}
//    public void walk3(int... steps, int start) {}     // will not compile, only the last parameter can be a vararg
//    public void walk4(int... steps, int... start) {}  // will not compile, only one vararg parameter allowed - the last
}
