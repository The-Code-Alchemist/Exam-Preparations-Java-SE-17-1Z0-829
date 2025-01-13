/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 255
 * Returning Objects, how to get back data from methods - return
 */
package methods;

public class ZooTickets {
    public static void main(String[] args) {
        int tickets = 2;                        // tickets  = 2
        String guests = "abc";                  // guests   = abc
        addTickets(tickets);                    // tickets  = 2

        // pay close attention to how lines 15 and 18 differ and why
        addGuests(guests);                      // guests   = abc
        System.out.println(tickets + guests);   // 2abc

        guests = addGuests(guests);             // guests   = abcd
        System.out.println(tickets + guests);   // 2abcd
    }
    public static int addTickets(int tickets) {
        tickets++;
        return tickets;
    }
    public static String addGuests(String guests) {
        guests += "d";
        return guests;
    }
}
