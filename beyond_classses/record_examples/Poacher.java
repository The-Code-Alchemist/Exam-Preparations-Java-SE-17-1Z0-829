/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 374 - 375
 * The Poacher class cannot change the numberEggs value, such as on line 10
 * Since a setter is not present in the Crane class, which means the numberEggs and name variables
 * can only be set when creating a new Crane object
 */
package beyond_classses.record_examples;
public class Poacher {
    public void badActor() {
        var mother = new CranePOJO(5, "Cathy");
     // mother.numberEggs = -1;
        System.out.println(mother.getNumberEggs());

    }
}
