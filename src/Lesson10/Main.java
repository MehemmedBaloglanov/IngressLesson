package Lesson10;

import Lesson10.My_exception.MyException;

public class Main {

    public static void main(String[] args) {
        try{
        sum();
        } catch (RuntimeException e) {
            throw new MyException("divided zero");
        }
    }
    public static int sum(){
        int a=12;
        int b=0;
        return a/b;
    }
}
