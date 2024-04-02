package Lesson17.Map;

import java.util.TreeMap;

public class TresHashMapExample {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap=new TreeMap<>();
        treeMap.put(1,"John1");
        treeMap.put(2,"John2");
        treeMap.put(3,"John3");

        System.out.println(treeMap.containsValue("John1"));
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap);
    }
}
