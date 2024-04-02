package Lesson6.oneDefault_oneAbstract;

public class Student implements Named,Person{

    //Eger ki iki dene interfaceden eyni vaxtda implement elemisikse ve her ikisinde
    // eyni adli method varsa onda mutleq sekilde onlari override elemek lazimdir
    @Override
    public String getName(){
        return Named.super.getName();
    }

//    @Override
//    public String getName(){
//        return "Mine Method";
//    }



    public static void main(String[] args) {
      Student student = new Student();
        System.out.println(student.getName());
    }
}
