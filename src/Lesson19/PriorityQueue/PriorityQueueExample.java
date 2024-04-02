package Lesson19.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        simpleExample();
    }

    public static void simpleExample(){
        Queue<Integer> integerPriorityQueue = new PriorityQueue<>();
        integerPriorityQueue.add(5);
        integerPriorityQueue.add(7);
        integerPriorityQueue.add(1);
        integerPriorityQueue.add(10);

        System.out.println(integerPriorityQueue);
        //----------------------------------
        integerPriorityQueue.remove();
        System.out.println(integerPriorityQueue);
        //----------------------------------
        integerPriorityQueue.poll();
        System.out.println(integerPriorityQueue);
        //----------------------------------
        System.out.println(integerPriorityQueue.peek());
        //----------------------------------
        System.out.println(integerPriorityQueue);
    }
}
