package Lesson6.Immutable2;

import java.util.Date;

final class  Student { //1)Class final olmalidir
    private int age;//2)Fieldlar private olmalidir
    private String name;
    private Date date;

    public Student(int age, String name, Date date) {
        this.age = age;
        this.name = name;
        this.date = date;
    }

    public int getAge() {//3)Deyismesin deye setter methodlar olmamalidir
        return age;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
//        return date;
        return (Date) date.clone();//4) Eger immutable classin icersisinde composition elemek isteyimiz class mutabledirsa
        // onda onun getter methodunda ozunu yox clonunu qaytarmaq lazimdir.
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
