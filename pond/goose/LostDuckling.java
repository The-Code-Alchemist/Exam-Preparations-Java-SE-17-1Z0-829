/**
 * @author The Code Alchemist
 * from Chapter 5: Methods, page 242
 * Example of a public access modifier
 */
package pond.goose;
import pond.duck.DuckTeacher;
public class LostDuckling {
    public void swim() {
        var teacher = new DuckTeacher();
        teacher.swim();                                 // allowed
        System.out.println("Thanks " + teacher.name);   // allowed
    }

    public static void main(String[] args) {
        new LostDuckling().swim();
    }
}
