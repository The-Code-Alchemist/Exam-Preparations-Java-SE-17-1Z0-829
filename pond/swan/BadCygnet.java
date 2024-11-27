/**
 * @author The Code Alchemist
 * from Chapter 5: Methods, page 237 - 242
 * A class in a different package connot access private and package-private fields of that class
 * protected fields can be accessed by classes outside their package through inheritance
 *
 * N.B. A baby swan is called a cygnet
 */
package pond.swan;
import pond.duck.MotherDuck;
public class BadCygnet extends MotherDuck {
    public void makeNoise() {
        var duck = new MotherDuck();
//        duck.quack();                     // will not compile with package-private access in pond.duck.MotherDuck
//        System.out.println(duck.noise);   // will not compile with package-private access in pond.duck.MotherDuck
    }
}
