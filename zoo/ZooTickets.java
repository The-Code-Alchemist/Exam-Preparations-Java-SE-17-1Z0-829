/**
 * @author The Code Alchemist
 * Chapter 5 and 6: Methods and Class Design, page 255, 301
 * pass-by-value and initalizing instance examples
 */
package zoo;

public class ZooTickets {
    private String name = "BestZoo";
    { System.out.print(name + "-"); }
    private static int COUNT = 0;
    static  { System.out.print(COUNT + "-"); }
    static  { COUNT += 10; System.out.print(COUNT + "-");}

    public ZooTickets() {
        System.out.print("z");
    }

    public static void main(String... patrons) {
        new ZooTickets();


        // previous fragment
        int tickets = 2;                        // tickets = 2
        String guests = "abc";                  // guests  = abc
        addTickets(tickets);                    // tickets = 2
        guests =  addGuests(guests);            // guests  = abcd
        System.out.println(tickets + guests);   // 2abcd
    }

    public static int addTickets(int tickets) {
        tickets++;
        return tickets;
    }

    private static String addGuests(String guests) {
        guests += "d";
        return guests;
    }
}
