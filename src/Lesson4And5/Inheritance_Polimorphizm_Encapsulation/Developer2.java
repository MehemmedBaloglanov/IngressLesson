package Lesson4And5.Inheritance_Polimorphizm_Encapsulation;

public class Developer2 extends Employee2{
        private int bonus;

    public Developer2() {
    }

    public Developer2(int id, String name, String position, double salary, int bonus) {
        super(id,name , position, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary(){
        return bonus + super.getSalary();
    }

}

