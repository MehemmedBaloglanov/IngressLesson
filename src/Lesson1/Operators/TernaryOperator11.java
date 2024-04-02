package Lesson1.Operators;

import java.util.Scanner;

public class TernaryOperator11 {
    public static void main(String[] args) {
        //TERNARY OPERATOR GERI NESE QAYTARAN IF ELSE MENTIQI YAZMAQ UCUN ISTIFADE EDILIR

        //create an object of Scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = scan.nextInt();

        System.out.println("Enter second number: ");
        int b = scan.nextInt();

        int max =  a>b ? a:b;//ternary opeaterun neticesini hemise neyese menimsetmek lazimdir

        System.out.println("Max of numbers: "+max);

        //IF, ELSE IF , ELSE MENTIQI ASAGIDAKI KIMI YAZILIR

        //int num = 10;
        //String msg = num>10?"Number is greater than 10"(if) : num>5? "Number is greater than 5"(else if) :"Number is less than equal to 5"(else);

        //closing the scanner object
        scan.close();
    }
}
