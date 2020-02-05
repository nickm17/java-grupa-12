package ro.siit.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaTimeAPI {

    public static void main(String[] args) {

        LocalDate acum = LocalDate.now();
        System.out.println(acum);

        LocalDateTime acumCuTime = LocalDateTime.now();
        System.out.println(acumCuTime);

        LocalTime acumTime = LocalTime.now();
        System.out.println(acumTime);

        LocalDate localDate = LocalDate.of(2020,2,29);
        localDate = localDate.plusDays(5).plusDays(5).plusDays(50).plusYears(1).plusMonths(1);
//        localDate = localDate.plus(Period.ofDays(5));
        System.out.println(localDate);

        LocalDate localDateFromString = LocalDate.parse("2020/03/15", DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(localDateFromString);

    }

}
