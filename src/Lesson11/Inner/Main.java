package Lesson11.Inner;

public class Main {
    public static void main(String[] args) {
        Car bmw=new Car("BMW",120);
        Car.HandlBar handlBar = bmw.new HandlBar();//Inner Classlarin obyekti bele yaradilir
        Car.Seat seat=bmw.new Seat();

        seat.up();
        bmw.start();
        handlBar.left();
        handlBar.right();
    }
}
