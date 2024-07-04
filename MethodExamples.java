/**
 * @author The Code Alchemist
 * from Chapter 5: Methods, page 227, 228
 */
public class MethodExamples {

    // a method can be  by changing the order of the parameters
   public void visitZoo(String name, int waitTime) {}
   public void visitZoo(int waitTime, String name) {}

    public void zeroExceptions() {}

    public void onException() throws IllegalArgumentException, InterruptedException {}

    public void fly1() {}
//    public void fly2() // will not compile without method body
    public void fly3(int a) { int name = 5; }
}
