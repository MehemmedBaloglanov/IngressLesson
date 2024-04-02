package Lesson11.Inner;

public class Car {
    private String model;
    private int weight;

    public Car(String model, int weight) {
        this.model = model;
        this.weight = weight;
    }

    public void start(){
        System.out.println("GO!");
    }
    public class HandlBar{
        public void right(){
            System.out.println("Turn rigth!");
        }
        public void left(){
            System.out.println("Turn left!");
        }

    }

    public class Seat{
        public void up(){
            System.out.println("Seat up!");
        }

        public void down(){
            System.out.println("Seat is down!");
        }
    }
}
