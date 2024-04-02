package Lesson4And5.Inheritance_Polimorphizm_Encapsulation;

public class Polymorphizm3 {
    public static void main(String[] args) {
        Employee2 [] employee2s = new Employee2[3];

        employee2s[0] =new Developer2(1,"Ibrahim","Junior Developer",1200,100);
        employee2s[1]=new BackencDeveloper2(2,"Anar","Junior Developer",1200,100,"Java");
        employee2s[2]=new Employee2(3,"Orxan","HR",1200);

        for (Employee2 emp:employee2s) {
            emp.raiseSalary(10);
            System.out.println(emp);
        }
    }
}
