package Lesson6.Final;

public class Final1 {
    public static void main(String[] args) {
        final int a=6;
        //a=7; bu cur yazsaq complition error verecek cunki final yazdigimiz deyer hec zaman deyismir

        int a1=6;// Bu deyeri sona qeder deyismesey bu effectivly final deyeri sayilir.
        // Eger ki a1 deyeri deyisse onda effectivly final deyeri sayilmir
    }
}
