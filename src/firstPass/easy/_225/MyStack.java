package firstPass.easy._225;

import java.util.LinkedList;
import java.util.List;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/09 09:11
 */

/*
还有一种方法是使用两个队列，但是我嫌麻烦没有做
Another solution: use two queues, I have no interest

执行用时 :86 ms, 在所有 Java 提交中击败了77.97%的用户
内存消耗 :33.9 MB, 在所有 Java 提交中击败了75.66%的用户
 */

public class MyStack {

    private List<Integer> mystack;

    /** Initialize your data structure here. */
    public MyStack() {
        this.mystack = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        mystack.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int index = mystack.size() - 1;
        int result = mystack.get(index);
        mystack.remove(index);
        return result;
    }

    /** Get the top element. */
    public int top() {
        return mystack.get(mystack.size() - 1);
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return mystack.isEmpty();
    }

    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(2);
        obj.push(3);
        int param_2 = obj.pop();
        int param_3 = obj.top();
        boolean param_4 = obj.empty();
        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
    }
}
