import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import java.util.Date;

/**
 * @author The Code Alchemist
 * Chapters 4: Core APIs, pages 192, 193, 194, 195, 196, 197
 * Dates and Times
 */
public class DatesAndTimes {
    public static void main(String[] args) {
        // Shows the date. Will not be on the 1Z0-829 Java SE 17 exam.
        System.out.println(new Date());

        // LocalDate contains only the date - without time and without time zone
        System.out.println(LocalDate.now());

        // LocalTime contains only the time - without date and without time zone
        System.out.println(LocalTime.now());

        // LocalDateTime contains both a date and a time, but no time zone
        System.out.println(LocalDateTime.now());

        // ZonedDateTime contains a date, time and a time zone
        System.out.println(ZonedDateTime.now());

        // date1 and date2 do the same, but the way date1 is defined is easier to read (and maintain) in practice
        var date1 = LocalDate.of(2022, Month.JANUARY, 20);
        System.out.println(date1);
        var time1 = LocalTime.of(6, 15);                               // hour and minute
        System.out.println(time1);

        var date2 = LocalDate.of(2022, 1, 20);
        System.out.println(date2);
        var time2 = LocalTime.of(6, 15, 30);                    // + seconds
        System.out.println(time2);

        var time3 = LocalTime.of(6, 15, 30, 2000);  // + nanoseconds
        System.out.println(time3);

        var dateTime1 = LocalDateTime.of(2022, Month.JANUARY, 20, 6, 15, 30);
        System.out.println(dateTime1);
        var dateTime2 = LocalDateTime.of(date1, time1);     // two variables are passed to initialize dateTime2
        System.out.println(dateTime2);

        var zone = ZoneId.of("US/Eastern");
        var zoned1 = ZonedDateTime.of(2022, 1, 20, 6, 15, 30 , 200, zone);
        System.out.println(zoned1);     // all fields entered individually - not recommended in practice, hard to read

        var zoned2 = ZonedDateTime.of(date1, time1, zone);
        System.out.println(zoned2);     //  date and time ar passed

        var zoned3 = ZonedDateTime.of(dateTime1, zone);
        System.out.println(zoned3);     // date time is passed

        // Invalid day throws an Exception
        var d = LocalDate.of(2022, Month.JANUARY, 32);
        System.out.println(d);
    }
}
