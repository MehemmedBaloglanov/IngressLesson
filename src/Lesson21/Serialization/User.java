package Lesson21.Serialization;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID=634765;//Bu hemise yazilmalidir. Cunki serialization etdikde sonra eger ki deyisiklik olsa o zaman
    //deserialization olanda obyektde olan deyisikliyi tanimir ve error atir
    private int id;
    private String name;
    private transient String password;//transient eger ki hansisa bir fieldi serialization elemek istemirikse istifade edirik.Bunu yazanda
    //deyer null kimi gosterecek

    public User() {

    }

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
