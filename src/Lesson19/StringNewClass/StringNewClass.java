package Lesson19.StringNewClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringNewClass {
    public static void main(String[] args) {
        stringJoiner();
        stringJoin();
        stringListJoin();
        listJoining();
    }

    static void stringJoiner(){
        StringJoiner stringJoiner= new StringJoiner(", ");

        stringJoiner.add("John");
        stringJoiner.add("Danny");
        stringJoiner.add("Lui");

        System.out.println(stringJoiner.toString());
    }

    static void stringJoin(){
        String numbers =String.join(":" ,"1","0","1","0");
        System.out.println(numbers);
    }

    static void stringListJoin(){
        List<String> databases= Arrays.asList("OracleDB","Mongo","PostgreSQL","MySQL");
        String str=String.join(",",databases);
        System.out.println(str);
    }

    static void listJoining(){
        List<String> list = Arrays.asList("React","SpringBoot","NodeJS","Django");
        String collect =list.stream()
                .collect(Collectors.joining("","{","}"));
        System.out.println(collect);
    }
}
