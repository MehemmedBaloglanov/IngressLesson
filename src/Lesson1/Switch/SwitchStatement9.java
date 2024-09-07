package Lesson1.Switch;

import java.util.Scanner;

public class SwitchStatement9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        // Bu yazilisda olan Switch en son versiyalarda oz eksini tapib
         String size =switch(number){
             case 29 -> "Small";
             case 42 -> "Medium";
             case 44 -> "Large";
             case 48 -> "Extra large";
             default -> "Unknown";
         };

        //Switch statement to check size
//        switch (number){
//            case 29:
//                size ="Small";
//                break;// Break olmasaydi case 29 a girdikden sonra dayanmayib case 42 ye de girecekdi.
//            case 42:
//                size="Medium";
//                break;
//            case 44:
//                size="Large";
//                break;
//            case 48:
//                size="Extra large";
//                break;
//            default:
//                size="Unknown";
//                break;
//        }
        System.out.println("Size: "+size);
        scan.close();


    }
}
