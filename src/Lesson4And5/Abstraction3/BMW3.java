package Lesson4And5.Abstraction3;

public class BMW3 extends Car3{
    @Override
    public void run(){
        setSpeed(200);
        System.out.println(getSpeed());
    }
}
