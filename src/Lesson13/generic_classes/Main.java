package Lesson13.generic_classes;

public class Main {

    public void doNotDoIt(){
        GenericEmployee employee = new GenericEmployee(1,750,25);
        GenericEmployee employee1 = new GenericEmployee(1,750,"25");

        int age=(int) employee1.getAge();
        System.out.println(age);
    }

    public void doNotDoIt2(){
        GenericEmployee<Integer,String> employee = new GenericEmployee(1,750,25);
        String age = employee.getAge();
        System.out.println(age);

        int age2 =Integer.parseInt(employee.getAge());
        System.out.println(age2);
    }

    public void doIt(){
        GenericEmployee<Integer,String> employee = new GenericEmployee<>(1,750,"25 age");

        String age =employee.getAge();
        System.out.println(age);
    }

    public static void main(String[] args) {
        Main main= new Main();
            main.doNotDoIt();
            main.doNotDoIt2();
            main.doIt();
    }

}
