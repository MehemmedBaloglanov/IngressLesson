package Lesson13.generic_restrictions;

public class Test <T extends Employee >{
    private T t;
    public T getT(){
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void raiseSalary(T t,double byPercent){
        double salary = t.getSalary();
        double raise = salary*byPercent/100;
        salary +=raise;
        t.setSalary(salary);
    }

    public static void main(String[] args) {
        Test<Developer> test =new Test<>();
        Developer developer = new Developer(1,"Mehemmed",1000,500);
        test.raiseSalary(developer,10);
        System.out.println(developer.getSalary());

        JavaDeveloper developer1 = new JavaDeveloper(2,"Seid",1500,300,10);
        test.raiseSalary(developer1,10);
        System.out.println(developer1.getSalary());
    }
}
