package Lesson4And5.Inheritance_Polimorphizm_Encapsulation;

public class EncapsualtionTest3 {
    public static void main(String[] args) {
        Employee2 employee2= new Employee2();
        employee2.setName("Ilkin");

        if(employee2.getPosition()!=null){//Biz en birinci Obyekt yaradanda onun deyerleri null olur. Ona gore nese emeliyyat aparmaq
            // isteyirikse gerek birinci null olub olmadigini yoxlayaq
            employee2.setPosition(employee2.getPosition().concat("Mutexessis"));
        }else{
            employee2.setPosition("Mutexessis");
        }

        System.out.println(employee2);
    }
}
