package Lesson1.IfElse;

import java.util.Scanner;

public class IfStatement8 {
    public static void main(String[] args) {
        Scanner scan  =new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scan.nextInt();

        //checks if number is greater than 0;
        if(number>0){
            System.out.println("The number is pozitive");
        }

        //checks if number is less than 0
        else if(number<0){
            System.out.println("The number is negative");
        }

        //if both condition is false
        else{
            System.out.println("The number is 0");
        }

        //close the scanner object
        scan.close();

//       1 line if blokunu {} olmadan da yazmaq olar
         if(number == 4) System.out.println("Number is four");
    }
}
