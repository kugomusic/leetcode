package firstPass.easy._232;

import java.util.Stack;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/09 20:15
 */

/*
使用两个栈模拟队列，一个进一个出
Use two stacks to simulate queue, one in and one out

执行用时 :88 ms, 在所有 Java 提交中击败了58.29%的用户
内存消耗 :34.2 MB, 在所有 Java 提交中击败了49.05%的用户
 */

public class MyQueue {

    private Stack<Integer> stackIn;
    private Stack<Integer> stackOut;

    /** Initialize your data structure here. */
    public MyQueue() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        while (!stackOut.empty()) {
            stackIn.push(stackOut.pop());
        }
        stackIn.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while (!stackIn.empty()) {
            stackOut.push(stackIn.pop());
        }
        return stackOut.pop();
    }

    /** Get the front element. */
    public int peek() {
        while (!stackIn.empty()) {
            stackOut.push(stackIn.pop());
        }
        return stackOut.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return (stackIn.empty() && stackOut.empty());
    }

    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();
        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
    }
}
