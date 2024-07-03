import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author The Code Alchemist
 * Chapters 4: Core APIs, 203, 204, 205
 */
public class DurationPeriodInstantComparison {
    public static void main(String[] args) {
        var date = LocalDate.of(2022, 1, 20);
        System.out.println("date: " + date);

        var time = LocalTime.of(6, 15);
        System.out.println("time: " +time);

        var dateTime = LocalDateTime.of(date, time);
        System.out.println("dateTime: " + dateTime);

        var duration = Duration.ofHours(6);
        System.out.println("duration:" + duration);

        System.out.println("dateTime + duration = " + dateTime.plus(duration));
        System.out.println("time + duration = " +time.plus(duration));

    //  java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Seconds
    //  System.out.println(date.plus(duration));


        date = LocalDate.of(2022, 5,25);
        var period = Period.ofDays(1);
        var days = Duration.ofDays(1);
        System.out.println("date + period: " + date.plus(period));
        System.out.println("days: " + days);

    //  java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Seconds
    //  System.out.println("date + days: " +date.plus(days));

        var now = Instant.now();
        System.out.println("" +now);
        // do something time-consuming
        var later = Instant.now();
        System.out.println("" + later);

        duration = Duration.between(now, later);
        System.out.println("duration to millis: " + duration.toMillis());   // in ms

        time = LocalTime.of(11, 55, 00);
        System.out.println("time: " + time);

        var zone = ZoneId.of("Europe/Amsterdam");
        System.out.println("NL: " + zone);

        var zonedDateTime = ZonedDateTime.of(date, time, zone);
        System.out.println("zonedDateTime: " + zonedDateTime);
        var instant = zonedDateTime.toInstant();
        System.out.println("instant: " + instant);
    }
}
