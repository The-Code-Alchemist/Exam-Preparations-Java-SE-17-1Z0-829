/**
 * @author The Code Alchemist
 * Chapters 5: Methods, page 222, 223, 224, 225, 226
 * Demonstrating some method examples
 */
public class Exercise {
    // page 222
    public void skip1() {}
    /* default*/void skip2() {}

    /* void */ public int skip3() {
        return  1;
    }

    void skip4() {}

    // page 223
    public void bike() {}
    public final void bike2() {}
    public static final void bike3() {}
    public final static void bike4() {}

//    public modifier void bike5() {}       // will not compile, modifier is not a valid modifier
//    public void final bike6() {}          // will not compile, final not allowed after return type

    final public void bike7() {}

    // page 224
    public void swim(int distane) {
        if(distane <= 0) {
            // exit early, nothing to do!
            return; // the only return allowed in a void method
        }
        System.out.println("Fish is swimming " + distane + " meters");
    }

    public void hike1() {}
    public void hike2() { return; }
    public String hike3() { return ""; }
//  public String hike4() { }       // will not compile without return statement
//  public hike5() {}               // will not compile without return type

//  public String int hike6() {}    // will not compile, only one return type allowed

    // page 225
//  public String hike7(int a) {
//      if (1 < 2) return "orange";
//  }

    String hike8(int a) {
        if (1 < 2) return "orange";
        return "apple";
    }

    int getHeight1() {
        int temp = 9;
        return temp;
    }
    int getHeight2() {
//      int temp = 9L;      // you can't assign a long to an int
        int temp = 1;
        return temp;
    }
    int getHeight3() {
      long temp = 9;      // you can't return a long value as an int, not without casting
//        int temp = 2;
        return (int) temp;
    }

    int getHeight4() {
        long temp = 9;
        return Math.toIntExact(temp);
    }

    int getHeight5() {
        long temp = 9;
        return (int) temp;
    }

    // page 226
    public void jog1() {}
//    public void 2jog() {}     // identifiers such as method name can't start with a number
//    public jog3 void() {}     // method name before return type
    public void Jog_$() {}      // will compile, but this is a very bad practice

//    public _() {}             // a single underscore is not allowed as an identifier such as a method name

//    public void () {}         //  method name missing

    public void run1() {}
//    public void run2 {}       // parentheses missing, will not compile
    public void run3(int a) {}
    public void run3(int i, long l) {}  // overloaded version of the previous method
    //    public void run4(int a; int b) {}   // ; not allowed to separate parameters, use a , instead - see next line
    public void run5(int a, int b) {}


}
