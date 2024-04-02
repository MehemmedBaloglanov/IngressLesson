package Lesson4And5.Inheritance_Polimorphizm_Encapsulation;

public class BackencDeveloper2 extends Developer2 {

    private String programmingLanguage;

    public BackencDeveloper2() {
    }

    public BackencDeveloper2(int id, String name, String position, double salary, int bonus, String programmingLanguage) {
        super(id, name, position, salary, bonus);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

}
