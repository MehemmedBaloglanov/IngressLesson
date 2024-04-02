package Lesson4And5.Abstraction3;

abstract class Car3 {
    private int speed;

    public Car3() {
    }

    public Car3(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car3{" +
                "speed=" + speed +
                '}';
    }

     abstract public void run();

    public void stop(){
        speed=0;
        System.out.println(speed);
    }
}
