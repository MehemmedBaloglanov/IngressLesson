package Lesson18;

import java.util.List;
import java.util.Objects;

public class Person1 {
    private String name;
    private List<String> pets;

    public Person1(String name, List<String> pets) {
        this.name = name;
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPets() {
        return pets;
    }

    public void setPets(List<String> pets) {
        this.pets = pets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person1 = (Person1) o;
        return Objects.equals(name, person1.name) && Objects.equals(pets, person1.pets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pets);
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", pets=" + pets +
                '}';
    }
}
