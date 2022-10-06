package DATETIMESAMPLE;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeCurrent {

    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);
        LocalDateTime dT = LocalDateTime.now();
        ZonedDateTime zt = ZonedDateTime.now();
        System.out.println("zone time "+zt);
       // String format ="yyyy-MM-dd HH:mm:ss";
        String format ="mm-dd-yyyy HH:mm:ss";
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern(format);
        String afterFormat = dT.format(myFormatObj);
        System.out.println(dT+" -- " +afterFormat);
        LocalTime time = LocalTime.now();
        System.out.println(time);
    }
}
