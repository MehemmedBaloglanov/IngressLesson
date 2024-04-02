package Lesson16.Set;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
//        hashSetExample();
//        treeSetExample();
        System.out.println();
    }

    public static void hashSetExample(){
        HashSet<Integer> set;

        List<Integer> list = Arrays.asList(1,2,2,4);
        set = new HashSet<>(list);

        System.out.println(set);


    }

    public static void treeSetExample(){
        Set<String> sorter = new TreeSet<>();
        sorter.add("Bob");
        sorter.add("amy");
        sorter.add("Ani");
        sorter.add("Carl");

        for (String s: sorter) {
            System.out.println(s);
        }
    }
}
