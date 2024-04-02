package Lesson11.LocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {
    public static void main(String[] args) {
//        minusPeriod();
//        format();
//        parse();
//        defaultParse();
//        System.out.println(test("16/12/2015"));
//        System.out.println(LocalDateTime.now());//2023-12-11T09:17:28:827599
    }

    public static void minusPeriod(){// Hansisa bir tarixden mueyyen bir gun sayi cixmaq ucun istifade edirik
        LocalDate a = LocalDate.of(2014,6,30);
        LocalDate b = a.minus(Period.ofDays(100));
        System.out.println(b);
    }

    public static void format(){
        LocalDate date = LocalDate.now();
        System.out.println(date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(formatter.format(date));
    }

    public static void parse(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date ="16/08/2016";

        //convert String to LocalDate

        LocalDate localDate =LocalDate.parse(date,formatter);
        System.out.println(localDate);
    }

    public static void defaultParse(){
        String date ="2016-08-16";

        //default,ISO_LOCAL_DATE

        LocalDate localDate = LocalDate.parse(date);
        System.out.println(localDate);
    }

    public static String test(String date) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(date, dateTimeFormatter);
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return dateTimeFormatter1.format(localDate);
    }


}
