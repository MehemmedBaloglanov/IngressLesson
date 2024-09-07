package Lesson1.Operators;

public class UnaryOperators5 {
    public static void main(String[] args) {
        //declare variables
        int a = 12, b=12;
        int resualt1 , resualt2;


        //original value of a
        System.out.println("Value of a: "+a);

        //increment operator
        resualt1 = ++a; //bu pre-incrementdir. Yeni ki ilk once artirir sonra emeliyyati icra edir.Burda artiranda hemde eyni zamanda menimsedir
        System.out.println("After pre-increment: " + resualt1); //Outputs:13

        //increment operator
        resualt1 = a++; //bu post-incrementdir. Burda emeliyyati yerine yetirir ama ki gostermir.Yeni ki burda artirir ama ki menimsetmir. Daha sonra her hansi bir emeliyyat icra elesen onda artirir
        System.out.println("After post increment: " + resualt1); //Outputs:13

        //original value of b
        System.out.println("Value of b: "+b);

        //decrement operator
        resualt2 = --b; //bu pre-decrementdir. Yeni ki ilk once azaldir sonra emeliyyati icra edir.Burda azaldanda hemde eyni zamanda menimsedir
        System.out.println("After pre-decrement: " + resualt2); //Outputs:11

        //decrement operator
        resualt2 = b--; //bu post-decrementdir. Burda emeliyyati yerine yetirir ama ki gostermir.Yeni ki burda azaldir ama ki menimsetmir. Daha sonra her hansi bir emeliyyat icra elesen onda azaldir
        System.out.println("After post decrement: " + resualt2); //Outputs:11

    }
}
