package Lesson13.generic_classes;

public class GenericEmployee <T, U>{
    private T id;
    private T salary;
    private U age;

    public GenericEmployee() {
    }

    public GenericEmployee(T id, T salary, U age) {
        this.id = id;
        this.salary = salary;
        this.age = age;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public T getSalary() {
        return salary;
    }

    public void setSalary(T salary) {
        this.salary = salary;
    }

    public U getAge() {
        return age;
    }

    public void setAge(U age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "GenericEmployee{" +
                "id=" + id +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
