package Lesson16.LinkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(31);
        linkedList.add(43);
        linkedList.add(12);
        linkedList.add(34);
        System.out.println(linkedList);

        linkedList.remove();
        System.out.println(linkedList);

        linkedList.removeFirstOccurrence(12);//dublicate olanlardan 1 cini silir
        System.out.println(linkedList);

        linkedList.add(45);
        System.out.println(linkedList);

        linkedList.addFirst(32);
        System.out.println(linkedList);

        Integer integer = linkedList.get(2);
        System.out.println(integer);

        System.out.println(linkedList.indexOf(45));

        System.out.println(linkedList.lastIndexOf(34));

        linkedList.offerFirst(11);
        System.out.println(linkedList);

        linkedList.pollFirst();
        System.out.println(linkedList);

        System.out.println(linkedList.peekFirst());
    }
}
