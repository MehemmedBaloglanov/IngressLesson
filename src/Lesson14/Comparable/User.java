package Lesson14.Comparable;

import java.util.Arrays;
import java.util.Objects;

public class User implements Comparable<User>{

    private String name;

    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(User user) {
        return Integer.compare(age, user.age);
    }


    public static void main(String[] args) {
        User[] users = new User[3];

        users[0] =new User("John",31);
        users[1]= new User("Ann",18);
        users[2] =new User("Dan",25);

        Arrays.sort(users);

        System.out.println(Arrays.toString(users));

    }
}

