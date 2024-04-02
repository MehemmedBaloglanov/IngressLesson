package Lesson1.Operators;

public class LogicalOperators7 {
    public static void main(String[] args) {
        //&& operators
        System.out.println((5>3)&&(8>5)); //Outputs: true --------> burda her iki teref "true" olsa cavab true-dur
        System.out.println((5>3)&&(8<3)); //Outputs: false--------> burda 1 teref "false" olsa cavab false -dur

        // || operator
        System.out.println((5<3)||(8>5)); //Outputs: true --------> burda iki terefden biri "true" olsa cavab true-dur
        System.out.println((5>3)||(8<5)); //Outputs: true
        System.out.println((5<3)||(8<5)); //Outputs: false--------> burda iki terefde "false" olsa cavab false-dur

        // ! operators
        System.out.println(!(5==3)); //Outputs:true ---------> burda "!" isare alinan mentiqi cavabin eksini qaytarir
        System.out.println(!(5>3));  //Outputs:false


    }
}
