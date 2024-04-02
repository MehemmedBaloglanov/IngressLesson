package Lesson9.ENUM;

import java.util.Arrays;
import static Lesson9.ENUM.WeekDays.MONDAY;
import static Lesson9.ENUM.WeekDays.TUESDAY;
import static Lesson9.ENUM.WeekDays.WEDNESDAY;
import static Lesson9.ENUM.WeekDays.THURSDAY;
import static Lesson9.ENUM.WeekDays.FRIDAY;
import static Lesson9.ENUM.WeekDays.SATURDAY;
import static Lesson9.ENUM.WeekDays.SUNDAY;
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(WeekDays.values()));//Bu formada yazanda Array formasinda Enumlari ala bilirik
        System.out.println("Day number MONDAY=" +MONDAY.getDay());
        System.out.println("Day number TUESDAY=" +TUESDAY.getDay());
        System.out.println("Day number WEDNESDAY=" +WEDNESDAY.getDay());
        System.out.println("Day number THURSDAY=" +THURSDAY.getDay());
        System.out.println("Day number FRIDAY=" +FRIDAY.getDay());
        System.out.println("Day number SATURDAY=" +SATURDAY.getDay());
        System.out.println("Day number SUNDAY=" +SUNDAY.getDay());


    }
}
