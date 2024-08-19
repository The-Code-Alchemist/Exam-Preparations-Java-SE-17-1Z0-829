/**
 * @author The Code Alchemist
 * from Chapter 2: Operators, pages 78, 79, 80, 81
 * Casting down
 */
package operators;
public class CastingDown {
    public static void main(String[] args) {
        int fur = (int) 5;                  // cast unnecessary, fur is already an int
        System.out.println(fur);
        int hair = (short) 2;
        System.out.println(hair);
        String type = (String) "zoo.Bird";      // cast unnecessary, type is already a String
        System.out.println(type);
        short tail = (short) (4 + 10);      // the sum of (4 + 10) is cast into a short
        System.out.println(tail);
        short anotherTail = (short) 4 + 10; // only 4 is cast into a short. 10 remains an int
        System.out.println(anotherTail);

        // Either cast will work. Omitting the cast, however results in a compiler error
        float egg = (float) 2.0 / 9;        // casts the division 2.0/9 to float
        System.out.println(egg);
        float anotherEgg = (float) 2.0 / 9; // casts only 2.0 to float
        System.out.println(anotherEgg);

        int fish = (int) 1.0;
        System.out.println(fish);
        short bird = (short) 1921222;       // Stored as 20678
        System.out.println(bird);
        int mammal = (int) 9f;
        System.out.println(mammal);

        /**
         * long reptile = 192_301_398_193_810_323 will NOT compile, because it will be assigned as an int out of range
         * long reptile = (long) 192_301_398_193_810_323 will NOT compile either. Still out of range.
         * long reptile = (long)192_301_398_193_810_323L will compile. Cast is redundant in this case.
         */
        long reptile = 192_301_398_193_810_323L;
        System.out.println(reptile);

        short mouse = 10;
        System.out.println(mouse);
        short hamster = 3;
        System.out.println(hamster);

        /**
         * Cast both mouse AND hamster to short.
         * Casting only mouse, hamster OR neither results in a compiler error
         */
        short capybara = (short) (mouse * hamster);
        System.out.println(capybara);

        byte hat = 1;
        System.out.println(hat);
        byte gloves = 7 * 10;
        System.out.println(gloves);
        short scarf = 5;
        System.out.println(scarf);
        short boots = 2 + 1;
        System.out.println(boots);

        // these will not compile without casting
        boots = (short) (2 + hat); // both operands will be promoted to int
        System.out.println();
        gloves = (byte) (7 * 100); // both operands will be promoted to int
        System.out.println(gloves);
    }
}