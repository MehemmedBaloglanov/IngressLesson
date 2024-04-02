package Lesson9.try_catch;

import java.util.InputMismatchException;

public class Example {
    public static int test(){
        int a =5;
        int b=0;


        try {
            return a/b;
        }catch (ArithmeticException| InputMismatchException e){
            System.out.println("Error happened");
        return -1;
        }catch (Exception e){
            System.out.println("Server error");
            return -2;
        }
    }

    public static void main(String[] args) {
        System.out.println(test());
    }


}
