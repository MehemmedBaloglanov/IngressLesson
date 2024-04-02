package Lesson4And5.Constructor1;

public class Animal1 {
    int leg;
    String color;

    public Animal1(int leg, String color) {
        this.leg = leg;
        this.color = color;
    }

    public Animal1() {

    }

    public Animal1(int leg) {
        this.leg = leg;
    }

    public int increaseLeg(int newLegCount){
        return this.leg+newLegCount;
    }

    public int increaseLeg(int newLegCount,int a){
        return this.leg+newLegCount+a;
    }


}
