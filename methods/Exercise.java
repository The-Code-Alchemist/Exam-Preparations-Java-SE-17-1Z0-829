/**
 * @author The Code Alchemist
 * Chapters 5: Methods, page 222 - 226
 * Demonstrating some valid and invalid method declaration examples
 * Invalid method declarations have been commented out with explanations at the end of the line
 */
package methods;
public class Exercise {

    public static void main(String[] args) {
        // main method added to make compilation easier through IntelliJ
    }

    // page 222
    public void skip1() {}
//    default void skip2() {}               // will not compile: default is not a valid access modifier

//    void public  skip3() {}               // will not compile: access modifier specified after the return type

    void skip4() {}

    // page 223
    public void bike1() {}
    public final void bike2() {}
    public static final void bike3() {}
    public final static void bike4() {}

//    public modifier void bike5() {}       // will not compile, modifier is not a valid modifier
//    public void final bike6() {}          // will not compile, final not allowed after return type

    final public void bike7() {}

    // page 224
    public void swim(int distance) {
        if(distance <= 0) {
            // exit early, nothing to do!
            return; // the only return allowed in a void method
        }
        System.out.println("Fish is swimming " + distance + " meters");
    }

    public void hike1() {}
    public void hike2() { return; }         // the only return allowed with void methods
    public String hike3() { return ""; }    // an empty String can be returned as well
//  public String hike4() { }               // will not compile, no return statement
//  public hike5() {}                       // will not compile, no return type

//  public String int hike6() {}            // will not compile, only one return type allowed

    // page 225
//  public String hike7(int a) {
//      if (1 < 2) return "orange";         // will not compile, because the return statement is not always executed
//  }

    public String hike7Revised(int a) {
      if (1 < 2) return "orange";
      else return null;                     // adding this return statement will make the method hike7 compile
    }

    String hike8(int a) {
        if (1 < 2) return "orange";
        return "apple";                     // Compiler will show a warning: unreachable code a.k.a. dead code
    }

    int getHeight1() {
        int temp = 9;
        return temp;
    }
    int getHeight2() {
//      int temp = 9L;                      // you can't assign a long to an int
        int temp = 9;
        return temp;
    }
    int getHeight3() {
        long temp = 9;                      // you can't return a long value as an int without casting
        return (int) temp;
    }

    int getHeight4() {
        long temp = 9L;
        return Math.toIntExact(temp);       // this is one way to return a long as an int
    }

    int getHeight5() {
        long temp = 9;
        return (int) temp;
    }

    // page 226
    public void jog1() {}
//    public void 2jog() {}     // identifiers such as method name can't start with a number
//    public jog3 void() {}     // method name is not allowed before return type
    public void Jog_$() {}      // will compile, but this is a very bad practice

//    public _() {}             // a single underscore is not allowed as an identifier such as a method name, return type is missing too
    public void _a() {}         // a method name can start with an underscore, though - don't forget the return type

//    public void () {}         // method name missing

    public void run1() {}
//    public void run2 {}       // parentheses missing, will not compile
    public void run3(int a) {}
    public void run3(int i, long l) {}  // overloaded version of the previous method
    //    public void run4(int a; int b) {}   // ; not allowed to separate parameters, use a , instead - see next line
    public void run5(int a, int b) {}


}
