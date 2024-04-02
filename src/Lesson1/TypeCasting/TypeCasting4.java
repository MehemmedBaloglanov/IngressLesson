package Lesson1.TypeCasting;

public class TypeCasting4 {
    public static void main(String[] args) {
        //Widening Casting(automatically) - converting a smaller type to a larger type size
        //byte -> short -> char -> int -> long -> float -> double

        //Narrowing Casting(manually) - converting a larger type to a smaller type size
        //double -> float -> long -> int -> char -> short -> byte

        int myInt = 9;
        double myDouble =myInt; // Automatic casting: int to double

        //System.out.println(myInt); //Outputs:9
        //System.out.println(myDouble); //Outputs:9.0


        double myDouble1 =9.78;
        int myInt1 = (int) myDouble1; //Manuel casting: double to int
        System.out.println(myInt1);
        //System.out.println(myDouble1); //Outputs: 9.78
        //System.out.println(myInt1); //Outputs: 9
    }
}
