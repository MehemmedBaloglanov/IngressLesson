package Lesson4And5.AccesModifiers3;

public class AccesModifiers3 {
    public static void main(String[] args) {

    }
    public void testPublic(){
        System.out.println("Public");//Her yerden elcatandir
    }

    void testDefault(){
        System.out.println("Default");//Yalniz aid oldugu Package icersinden elcatandir
    }

    protected void testProtected(){
        System.out.println("Protected");//Hem eyni package icersinde, hemde basqa package-in icerisinde bu package-de olan parent classi extends
        // eden subclass varsa ordan elcatandir
    }

    private void testPrivate(){
        System.out.println("Private");//Yalniz aid oldugu classin icersinden elcatandir
    }
}
