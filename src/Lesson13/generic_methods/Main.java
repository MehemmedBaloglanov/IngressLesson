package Lesson13.generic_methods;

public class Main {
    public static <T> T getMiddle(T... args){
// Burdaki T gelecekde deyise bileceyimiz bir seydir. meselen onu String-e cevirsey o zaman public static String getMiddle(String... args) olacaq
        return args[args.length/2];
    }


    public static void main(String[] args) {
        System.out.println(getMiddle(1,2,25,7,15));
        System.out.println(getMiddle("A","K","F"));
        aChar('1','4','3');
    }

    public static void aChar(char... args){ // varargs example
        for (char value: args) {
            System.out.println(value);
        }
    }
}
