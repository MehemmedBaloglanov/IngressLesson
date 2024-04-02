package Lesson17.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer,String> hashmap = new HashMap<>();
        hashmap.put(10,"John");
        hashmap.put(2,"John");


        hashmap.putIfAbsent(1,"Johny"); // Eger ki yazilan 1 keyden basqa yoxdursa onda yazacaq

        String s =hashmap.get(10);
        String s1 =hashmap.getOrDefault(3,"Osibka");// Eger get elediyimiz deyer yoxdursa basqa bi sey ekrana yazdirmaq ucun istifade olunur

        System.out.println(s);
        System.out.println(s1);


        for(Map.Entry<Integer,String> entry : hashmap.entrySet()){ // Hem key hemde value olani yazdirmaq ucundur
            Integer a=entry.getKey();
            String a1=entry.getValue();
            System.out.println(a);
        }


        System.out.println(hashmap);

        System.out.println(hashmap.get(1));

        System.out.println(hashmap.containsKey(2));

    }
}
