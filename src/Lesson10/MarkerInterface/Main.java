package Lesson10.MarkerInterface;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        if(user instanceof Payment){
            System.out.println("process payment");
        }else{
            System.out.println("You can't process payment");
        }

    }
}
