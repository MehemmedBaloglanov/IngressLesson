package Lesson2.Arrays2;

import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {

        example11();
    }

    public static void example1(){
        int [] arr = new int[3];
        System.out.println(arr[0]);
    }

    public static void example2(){
        int [] arr = {3,4,5};
        System.out.println(arr[0]);
    }

    public static void example3(){
        int [] arr=new int[3];
        arr[0]=3;
        arr[1]=4;
        arr[2]=5;
        System.out.println(arr[1]);
    }

    public static void  example4(){
        int [] arr ={4,5,6};
        for(int value : arr){
            System.out.println(value);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }
    }

    public static void example5(){
        int [] arr = {4,5,6};
        System.out.println(Arrays.toString(arr));
    }

    public static void example6(){
        int [] arr ={1,3,4};
        System.out.println(arr.length);
    }

    public static void example7(){
        int [] firstArray ={1,2,3,4,5};
        int [] secondArray = {5,4,3,2,1};

        int firstArrayIndex = 1;
        int secondArrayIndex =2;
        int length =3;
        System.arraycopy(firstArray,firstArrayIndex,secondArray,secondArrayIndex,length);
        System.out.println(Arrays.toString(secondArray));
    }

    public static void example8(){
        int [] arr = new int[10];
        int startIndex = 1;
        int endIndex = 4;//4 cu indekse qederdi
        Arrays.fill(arr,startIndex,endIndex,2);
    }

    public static void example9(){
        int [] arr = {3,5,1,2,6,4};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void example10(){
        int [] firstArray = {1,2,3};
        int [] secondArray ={1,2,3};
        boolean isEqual = Arrays.equals(firstArray,secondArray);
    }

    public static void example11(){
        int [] arr = {5,4,6,7,8,5,6};
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr,14);
        System.out.println(index);
    }

    public static void example12(){
        int [] arr1 ={5,4,6,4,7,8};
        int [] arr2 = {5,6,7};
        for(int i=0;i<arr1.length;i++){
            for(int k : arr2){
                if(arr1[i]==k) System.out.println(arr1[i]);
            }
        }
    }
        /*
        The size of the array(the number of cells) must be defined in int
        You cannot change the length of an array after it has been created.
        An array element can be accessed by its index
        In arrays, an else where in Java ,elements are numbered from zero
        After the procedure for creating an array, it is filled with default values.
         */

}
