/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 257
 * Autoboxing and unboxing example
 * Chapter 6: Class Design, page 301, 302
 * Inheritance examples
 */
package zoo;
public class Chimpanzee extends Ape {
    public void climb(long t) {}
    public void swing(Integer u) {}
    public void jump(int v) {}

    public Chimpanzee() {
        super(2);
        System.out.print("Chimpanzee-");
    }
    public static void main(String[] args) {
        new Chimpanzee();

        // autoBoxingPreviousChapter();  // chapter 5: Methods
    }

    private static void autoBoxingPreviousChapter() {
        var c = new Chimpanzee();
        c.climb(123);
        c.swing(123);
        c.jump(123);
        //  c.jump(123l);   // long parameter must be explicitly cast into an int,
        // or the code will not compile
    }
}

class Primate {
    public Primate() {
        super();    // inserted implicitly
        System.out.print("Primate-");
    }
}
class Ape extends Primate {
    public Ape(int fur) {
        super();    // inserted implicitly
        System.out.print("Ape1-");
    }
    public Ape() {
        System.out.print("Ape2-");
    }
}
