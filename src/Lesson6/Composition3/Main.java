package Lesson6.Composition3;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John",1500,new Passport("12345","6hd7"));
        //Burda Employee classinin icersinde bir Passport classi yaratdiq bu compositiondur

        //Eger ki Passportdaki pin-i almaq isteyirikse onda asagidaki kimi yazmaq lazimdir
        System.out.println(employee.getPassport().getPin());
    }
}
