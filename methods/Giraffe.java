/**
 * @author The Code Alchemist
 * from Chapter 5: Methods, page 247
 *
 * Table 5.5 worked out as code
 */
package methods;
public class Giraffe {
    public void eat(Giraffe g) {
        allGiraffeComeOut();
        drink();

        g = new Giraffe();
        g.eat(g);
    }
    public void drink() {};
    public static void allGiraffeGoHome(Giraffe g) {
        allGiraffeComeOut();

//        drink();  // not allowed without referencing an instance of this class

        g = new Giraffe();
        g.eat(g);
        g.drink();


    }
    public static void allGiraffeComeOut() {}

}
