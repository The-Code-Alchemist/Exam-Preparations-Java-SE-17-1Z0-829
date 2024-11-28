/**
 * @author The Code Alchemist
 * from Chapter 5: Methods, page 242
 * This class has only public members, it allows access to any class that wants it.
 */
package pond.duck;
public class DuckTeacher {
    public String name = "helpful";
    public void swim() {
        System.out.println(name);   // public access is OK
    }

    public static void main(String[] args) {
        new DuckTeacher().swim();
    }
}
