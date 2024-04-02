package Lesson21.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.push(12);
        deque.add(54);
        deque.offer(54);
        System.out.println(deque);

        deque.pollLast();
        System.out.println(deque);
    }
}
