package Lesson10.My_exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n<0){
            throw new MyException("This number is neqative");
        }
    }
}
