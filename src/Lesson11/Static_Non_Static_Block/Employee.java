package Lesson11.Static_Non_Static_Block;

public class Employee {
    private String name;
    private static int count=0;

    public Employee(String name) {
        this.name = name;
    }

    public Employee() {

    }

    {
        name="John";
        System.out.println("I'm from Non-static block");
    }

    static {
        count=5;
        System.out.println("I'm from Static block");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
