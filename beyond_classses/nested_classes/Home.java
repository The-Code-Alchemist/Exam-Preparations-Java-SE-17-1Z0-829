/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 383
 * Declaring an inner class on line 18
 * An inner class can access private members of a class.
 * The private String greeting is accessible by the inner class Room, because they are members of the same class Home.
 * Line 30 does not require an explicit instance of Home, because it is an instance method within the Home class.
 *
 * Both Room (line 17) and enterRoom() (line 28) are members of the outer class Home
 */
package beyond_classses.nested_classes;
public class Home {
    private String greeting = "Hi";     // Outer class instance variable

    // An inner class is not static, it has to be called using an instance of the outer class
    // That means you have to create two objects
    protected class Room {              // Inner class of the Home class
        public int repeat = 3;
        public void enter() {
             for (int i = 0; i < repeat; i++) greet(greeting);  // greeting defined in Home, accessible in Room as well
        }

        private static void greet(String greeting) {
            System.out.println(greeting);
        }
    }

    public void enterRoom() {           // Instance method in outer class Home
        var room = new Room();          // Create the inner class instance
        room.enter();
    }

    public static void main(String[] args) {
        var home = new Home();          // Create the outer class instance
        home.enterRoom();
    }
}