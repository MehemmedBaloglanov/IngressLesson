package Lesson1.Operators;

import java.util.Scanner;

public class IOOperators6 {
    public static void main(String[] args) {
        //create an object of Scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");

        //take input from the user
        int a = scan.nextInt();

        System.out.println("Enter second number: ");

        //take input for the user
        int b = scan.nextInt();

        int sum = a+b;

        System.out.println("Sum of numbers: "+sum);

        //closing the scanner object
        scan.close();

    }
}
