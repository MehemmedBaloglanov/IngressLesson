package Lesson14.WrapperClass;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Integer i=3;// Arxa planda Integer i = new Integer(3); kimi bir obyekt yaradir.
        System.out.println(i);

        System.out.println(Integer.parseInt("4"));// Stringi int-e yeni primitiv tipe cevirir
        System.out.println(Integer.valueOf("4"));//Stringi Integer-e yeni Wrapper deyere cevirir

        Integer first=128;
        Integer second= 128;
        System.out.println(first==second);//False
        //Burada Java -127 ile 128 arasindan kenarda olan deyerleri beraberliyini yoxlayanda goruruk ki false verir cunki o araliqda
        // yeni oyekt yaranir.
        //Amma yava -127 ve 128 arasinda hansisa bir deyeri muqayise edende true verir cunki ozu arxada bele nizamlayib.

        Integer a=45;
        Integer b=45;
        System.out.println(a==b);//true

        int value = 5;
        Integer t =value;//Bu antoboxingdir
        System.out.println(a);

        Integer y=12;
        int f =y;//Bu unboxingdir

        Integer e= 1;
        Double c =2.0;
        System.out.println(true?e:c);// Burada Integere double kecirerek 1.0 qaytarir




    }
}
