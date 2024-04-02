package Lesson14.Assertions;

public class AssertTest {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        System.out.println(sum(arr));
//        System.out.println(sum2(arr));
    }

    public static int sum(int[] arr){
        assert arr.length>0 && arr[0]>0 :"Number is neqative";
        int sum = 0;
        for (int value : arr){
            sum +=value;
        }
        return sum;
    }

//    public static int sum2(int[] arr){
//        if(arr.length>0 && arr[0]>0){
//            throw new RuntimeException("Mehemmed");
//        }
//     return 34;
//    }
}
