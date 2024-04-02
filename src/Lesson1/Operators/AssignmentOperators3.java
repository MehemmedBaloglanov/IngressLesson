package Lesson1.Operators;

public class AssignmentOperators3 {
    public static void main(String[] args) {
//create valiables
        int a=4;
        int result;

//        System.out.println(result);Bu complation error verecek "variable result might not have been initialized"

        //assign value using=
        result=a;
        System.out.println("result using =: " +result);

        //assign value using =
        result +=a;// result = result+a yazilisinin qisa formasidir
        System.out.println("result using +=: " + result);

        //assign value using =
        result -=a;// result = result-a yazilisinin qisa formasidir
        System.out.println("result using -=: " + result);

        //assign value using =
        result *=a;// result = result*a yazilisinin qisa formasidir
        System.out.println("result using *=: " + result);

        //assign value using =
        result /=a;// result = result/a yazilisinin qisa formasidir
        System.out.println("result using /=: " + result);

        //assign value using =
        result %=a;// result = result%a yazilisinin qisa formasidir
        System.out.println("result using %=: " + result);

    }
}
