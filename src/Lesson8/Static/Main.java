package Lesson8.Static;

public class Main {
    public static void main(String[] args) {
        MathUtil mathUtil = new MathUtil();
        mathUtil.sum(12,13);//Eger ki MathUtil sinifdeki sum funksiyasini static elemeseydik onu Obyekt yaradaraq bu cur cagirmali idik

        MathUtil.sum(12,13); //Amma ki static yazanda obyekt yaratmadan da onu cagira bilirik

    }
}
