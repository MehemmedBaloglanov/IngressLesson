package Lesson10.Interface_Dipnot;

public interface UserService {
    default void test(){
        System.out.println("I'm default method from UserService");
    }

    static void test2(){
        System.out.println("I'm static method from UserService");
    }

}
