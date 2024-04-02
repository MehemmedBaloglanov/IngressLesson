package Lesson17.Map;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"ilkin");
        map.put(3,"sabina");
        map.put(2,"mehemmed");

        System.out.println(map.get(2));

        map.replace(2,"Naila");// Eger ki 2 ci indekde deyer varsa override edir
        System.out.println(map.get(2));

        System.out.println(map.values());

        map.put(5,"Emin");

        map.computeIfAbsent(5,key ->key + ", " + "Emin");

        map.computeIfAbsent(8,key->key + ", " +"Elsen");
        System.out.println(map.get(2));

        map.put(10,"John");

        map.merge(10,"Snow" ,(oldValue,newValue)->oldValue+newValue);
        System.out.println(map.get(10));

        map.merge(22,"Snow" ,(oldValue,newValue)->oldValue+newValue);
        System.out.println(map.get(22));








    }
}
