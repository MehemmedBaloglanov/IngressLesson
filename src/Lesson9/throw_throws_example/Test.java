package Lesson9.throw_throws_example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    static void validate(int age){
        try {
            if(age<0) throw new ArithmeticException("Invalid age");
            else System.out.println("Valid age");
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }

    void readFile() throws IOException {
        FileInputStream fis = new FileInputStream("src/abc.txt");
        int i;
        while ((i = fis.read())!=-1){
            System.out.println((char)i);
        }
        fis.close();
    }

    void readFile1() {
        try {
            FileInputStream fis = new FileInputStream("src/abc.txt");
            int i;
            while ((i = fis.read()) != -1) {
                System.out.println((char) i);
            }
            fis.close();
        }catch (Exception e){
            System.out.println("Please retry later");
        }
    }

    void readFile2(){
        FileInputStream fis = null;

        try{
            fis =new FileInputStream("src/abc.txt");
        }catch (FileNotFoundException e){
            System.out.println("File with path src/abc.txt not found");
        }

        try {
            int i;
            while ((i = fis.read()) != -1) {
                System.out.println((char) i);
            }
            fis.close();
        }catch (Exception ex){
            System.out.println("System error. Please try later");
        }





    }

    public static void main(String[] args) {
        Test test = new Test();
//        try {
//            test.readFile();
//        } catch (IOException e) {
//            e.printStackTrace();//Bu exception haqqinda herseyi yazir
//        }
        System.out.println(1);
        try{
            test.readFile();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(2);



    }






}
