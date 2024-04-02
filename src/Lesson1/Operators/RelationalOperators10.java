package Lesson1.Operators;

public class RelationalOperators10 {
    public static void main(String[] args) {
        //create valiables
        int a=7,b=11;

        //Value of a and b
        System.out.println("a is "+ a + " b is "+b);

        // == operator
        System.out.println(a==b); // Outputs: false // bu bir birine beraber  olmadugunu yoxlayir

        // != operator
        System.out.println(a!=b); // Outputs: true // bu bir birine beraber olmadigini yoxlayir

        // > operator
        System.out.println(a>b);  // Outputs: false // bu solun boyuk oldugunu yoxlayir

        // < operator
        System.out.println(a<b); // Outputs: true // bu sagin boyuk oldugunu yoxlayir

        // >= operator
        System.out.println(a>=b); // Outputs: false // bu solun boyuk ve ya beraber oldugunu yoxlayir

        // <= operator
        System.out.println(a<=b); // Outputs: true // bu sagin boyuk ve ya beraber oldugunu yoxlayir

    }
}
