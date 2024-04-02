package Lesson15.Iterable;

import java.util.*;

public class Iterators {
    public static void main(String[] args) {
//        iteratorExample();
//        iteratorRemove();
        iterableExample();
    }


    public static void iteratorExample(){
        Collection<String> collection = new ArrayList<>();
        collection.add("A");
        collection.add("B");
        collection.add("C");

        Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }
    }
    public static void iteratorRemove(){
        Collection<String> collection = new ArrayList<>();
        collection.add("A");
        collection.add("B");
        collection.add("C");

        Iterator<String> iterator = collection.iterator();

        iterator.next();
        iterator.remove();
        System.out.println(collection);
    }

    public static void iterableExample(){
        Collection<String> collection = new ArrayList<>();
        collection.add("A");
        collection.add("B");
        collection.add("C");
        collection.add("D");

        for (String element:collection) {
            System.out.println(element);
        }
    }

    public static void scannerExample(){
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            if (Objects.equals(scanner.next(),"404")){
                break;
            }
        }
    }
}
