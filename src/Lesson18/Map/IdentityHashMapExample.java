package Lesson18.Map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapExample{
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        IdentityHashMap<String,String> identityHashMap = new IdentityHashMap<>();
        hashMap.put("a","a");
        hashMap.put(new String("a"),"a");

        identityHashMap.put("a","a");
        identityHashMap.put(new String("a"),"a");
        identityHashMap.put(new String("a"),"a");

        System.out.println(hashMap);
        System.out.println(identityHashMap);

    }
}
