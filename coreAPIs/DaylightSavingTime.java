/**
 * @author The Code Alchemist
 * Chapters 4: Core APIs, pages 206 - 207
 * Daylight saving examples
 */
package coreAPIs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DaylightSavingTime {
    public static void main(String[] args) throws Exception {
        var date = LocalDate.of(2022, Month.MARCH, 13);
        System.out.println("date:" + date);

        var time = LocalTime.of(1, 30);
        System.out.println("time: " + time);

        var zone = ZoneId.of("Europe/Amsterdam");
        System.out.println(zone);

        var dateTime = ZonedDateTime.of(date, time, zone);
        System.out.println("dateTime: " + dateTime);
        System.out.println("dateTime hour: " + dateTime.getHour());
        System.out.println("dateTime offset: " + dateTime.getOffset());

        dateTime = dateTime.plusHours(1);
        System.out.println("dateTime:" + dateTime);
        System.out.println("dateTime hour: " + dateTime.getHour());
        System.out.println("dateTime offset: " + dateTime.getOffset());

        date = LocalDate.of(2022, Month.NOVEMBER, 6);
        time = LocalTime.of(1, 30);
        zone = ZoneId.of("Europe/Amsterdam");
        dateTime = ZonedDateTime.of(date, time, zone);
        System.out.println("dateTime: " + dateTime);
        dateTime = dateTime.plusHours(1);
        System.out.println("dateTime: " + dateTime);
        dateTime = dateTime.plusHours(1);
        System.out.println("dateTime + 1 hour: " + dateTime);

        date = LocalDate.of(2022, Month.MARCH, 13);
        time = LocalTime.of(2, 30);
        zone = ZoneId.of("Europe/Amsterdam");
        dateTime = ZonedDateTime.of(date, time, zone);
        System.out.println("ZonedDateTime: " + dateTime);
    }
}
