package Lesson2.Method1;

public class Method1 {
    public static void main(String[] args) {
        System.out.println(createUser(12));
        createAccount();
        depositAccount();
    }

    //Methodlarda input ve output olur.
    //Void yazanda geriye hecne qaytarmir
    //Eger ki void yox basqa bir sey yazmisiqsa, onda return ile qaytarmaliyiq

    static boolean createUser(int age){
       return age>18;
    }

    static void createAccount(){
        System.out.println("Geri qaytarmayan method");
    }

    static void depositAccount(){

    }


}
