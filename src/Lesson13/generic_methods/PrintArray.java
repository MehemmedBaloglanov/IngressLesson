package Lesson13.generic_methods;

public class PrintArray {
    public static  <T> void printArray(T[] array){
        for (T element:array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] array ={5,2,6};
        printArray(array);
        printArray(new String[]{"asd","asd2"});
    }
}
