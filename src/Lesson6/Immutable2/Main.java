package Lesson6.Immutable2;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(21,"Mehemmed",new Date());
        Date date= student.getDate();
        date.setTime(0);
        System.out.println(student);
    }
}
