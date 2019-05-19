package firstPass.easy._155;

import java.util.Stack;

/*
每次入栈2个元素，一个是入栈的元素本身，一个是当前栈元素的最小值
Each time push 2 elements, one is the element that is pushed onto the stack, another is the minimum of the current stack elements

执行用时 : 106 ms, 在Min Stack的Java提交中击败了65.51% 的用户
内存消耗 : 44.3 MB, 在Min Stack的Java提交中击败了60.63% 的用户
 */

public class MinStack {

    private Stack<Integer> stack;

    public MinStack() {
        this.stack = new Stack<>();
    }

    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            stack.push(x);
        }
        else {
            int temp = stack.peek();
            stack.push(x);
            if (temp > x) {
                stack.push(x);
            }
            else {
                stack.push(temp);
            }
        }
    }

    public void pop() {
        stack.pop();
        stack.pop();
    }

    public int top() {
        return stack.get(stack.size() - 2);
    }

    public int getMin() {
        return stack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());;   // 返回 -3.
        minStack.pop();
        System.out.println(minStack.top());;      // 返回 0.
        System.out.println(minStack.getMin());;   // 返回 -2.
    }
}
