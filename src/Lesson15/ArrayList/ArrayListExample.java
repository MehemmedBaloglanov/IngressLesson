package Lesson15.ArrayList;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();

        //list.ensureCapacity(10); // Bu method evvelden capacityni vermek ucun istifade edirik

        boolean empty = list.isEmpty();// ArrayListin icersinin bos olub olmadigini yoxlamaq ucun istifade edirik
        System.out.println(empty);
        System.out.println("----------");

        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        System.out.println(list);
        System.out.println("---------");

        List<Integer> list1 = Arrays.asList(1,2,3,4);
        list.addAll(0,list1);
        System.out.println(list);
        System.out.println("---------");

        list.remove(0);
        System.out.println(list);
        System.out.println("--------");

        list.remove(Integer.valueOf(8));// 1 ci tapdigi 8 i silecek
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("---------");

        list.trimToSize(); // ArrayListde bos olan yerleri silir

        list.add(2,10);
        System.out.println(list);
        System.out.println("-----------");

        int firstIndex = list.indexOf(3);
        System.out.println(firstIndex);
        System.out.println("--------");

        int lastIndex = list.lastIndexOf(6);
        System.out.println(lastIndex);
        System.out.println("------");

        Integer max = Collections.max(list);
        System.out.println(max);

    }
}
