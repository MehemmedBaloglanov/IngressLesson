package Lesson4And5.Inheritance_Polimorphizm_Encapsulation;

public class InheritanceTest2 {
    public static void main(String[] args) {
        Employee2 employee2= new Employee2(1,"test","dev",100);
        Employee2 employee3= new Employee2(1,"test","dev",100);

        System.out.println(employee2.toString());
        System.out.println(employee3.toString());

        System.out.println(employee2.equals(employee3));//true

        int firstHashCode =employee2.hashCode();
        int secondHashCode=employee3.hashCode();

        System.out.println(firstHashCode);
        System.out.println(secondHashCode);

        System.out.println(firstHashCode==secondHashCode);//true
    }
}
