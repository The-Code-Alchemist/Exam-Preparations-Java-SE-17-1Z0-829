/**
 * @author The Code Alchemist
 * from Chapter 5: Methods, pages 243 - 244
 * static members belong to the class rather than any particular instance of the class
 *
 * static can also be applied to importing the static members of a class i.e. fields and methods
 * Think of a static variable as being a member of the single class object that exists independently of any instances of that class
 *
 * Anytime a static variable is updated, all istances of the class accessing that variable will be updated
 *
 * instance members can access static members, but static members cannot access instance members
 */
package methods;
public class Penguin {
    String name;
    static String nameOfTallestPenguin;             // accessible to every instance throughout the class



    public static void main(String[] args) {
        var p1 = new Penguin();
        p1.name = "Lilly";
        p1.nameOfTallestPenguin = "Lilly";

        var p2 = new Penguin();
        p2.name = "Willy";
        p2.nameOfTallestPenguin = "Willy";

        // static variable nameOfTallestPenguin is shared by p1 and p2
        System.out.println(p1.name);                    // Lilly - assignment from line 20
        System.out.println(p1.nameOfTallestPenguin);    // Willy - static assignment from line 25
        System.out.println(p2.name);                    // Willy - assignment from line 24
        System.out.println(p2.nameOfTallestPenguin);    // Willy - static assignment from line 25

        // static variable nameOfTallestPenguin is shared by p1 and p2
        nameOfTallestPenguin = "Billy";
        System.out.println(p1.nameOfTallestPenguin);    // Billy - assignment from line 34
        System.out.println(p2.nameOfTallestPenguin);    // Billy - assignment from line 34
        System.out.println(nameOfTallestPenguin);       // Billy - assignment from line 34
    }
}
