package Lesson4And5.Overloading3;

public class Overloading3 {
    public static void main(String[] args) {
        print(4);
        print("mehemmed");
    }

    public static void print(int a){
        System.out.println(a);
    }

    public static void print(String s){
        System.out.println(s);
    }

    //Overloading- de signature eyni input parametrler ferqli olmalidir.

}
