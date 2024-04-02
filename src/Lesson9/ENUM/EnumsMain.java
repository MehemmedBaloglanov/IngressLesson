package Lesson9.ENUM;
import java.util.Arrays;

import static Lesson9.ENUM.Size.SMALL;
import static Lesson9.ENUM.Size.LARGE;
import static Lesson9.ENUM.Size.EXTRA_LARGE;
public class EnumsMain {
    public static void main(String[] args) {
        Size s=EXTRA_LARGE;

        Size s1 = Enum.valueOf(Size.class,"SMALL");//Bu methodla hansisa bir Stringi Enuma cevire bilerik

        Size [] values =Size.values(); //Bu methodla biz enumin arrayini yarada bilerik

        System.out.println(s1);
        System.out.println(s.getAbbreviation());
        System.out.println(Arrays.toString(values));
        System.out.println(EXTRA_LARGE.ordinal()); //Bu funksiya Enum siralamasinda EXTRA_LARGE in yerini gostermek ucundur
        System.out.println(LARGE.toString());
        System.out.println(LARGE.compareTo(SMALL));
    }
}
