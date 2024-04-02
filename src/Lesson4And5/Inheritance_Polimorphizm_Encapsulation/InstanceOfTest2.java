package Lesson4And5.Inheritance_Polimorphizm_Encapsulation;

public class InstanceOfTest2 {
    public static void main(String[] args) {

        Developer2 developer2 = new Developer2();
        BackencDeveloper2 backencDeveloper2 = new BackencDeveloper2();

        System.out.println(developer2 instanceof Employee2);//true
        System.out.println(backencDeveloper2 instanceof Employee2);//true
        System.out.println(developer2 instanceof BackencDeveloper2);//false
        System.out.println(backencDeveloper2 instanceof Developer2);//true

    }
}
