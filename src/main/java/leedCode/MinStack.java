package leedCode;

import java.util.ArrayDeque;
import java.util.Queue;

public class MinStack {

    private final ArrayDeque<Integer> stack;
    private final ArrayDeque<Integer> minStack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    public void push(int val) {
        if (!minStack.isEmpty() && val <= minStack.peek() || (stack.isEmpty() && minStack.isEmpty())) {
            minStack.push(val);
            stack.push(val);
        } else {
            stack.push(val);
        }
    }

    public void pop() {
        if (stack.pop().equals(minStack.peek())) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.getFirst();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(0);
        minStack.push(1);
        minStack.push(0);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
//        System.out.println(minStack.top());    // return 0
        System.out.println(minStack.getMin()); // return -2
    }
}
