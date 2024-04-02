package Lesson21.Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.add(2);
        stack.addElement(5);
        //Yuxardaki 3 de element elave elemek ucundur

        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

    }


}
