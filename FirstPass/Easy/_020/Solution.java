package Easy._020;

import java.util.Stack;

/*
使用栈进行括号匹配
Use stack to math Parentheses

执行用时 : 8 ms, 在Valid Parentheses的Java提交中击败了62.25% 的用户
内存消耗 : 33.5 MB, 在Valid Parentheses的Java提交中击败了96.56% 的用户
 */

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            if (stack.empty()){
                stack.push(temp);
            }
            else if ((stack.peek() == '(' && temp == ')') || (stack.peek() == '[' && temp == ']') || (stack.peek() == '{' && temp == '}')){
                stack.pop();
            }
            else {
                stack.push(temp);
            }
        }
        if (stack.empty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("x=\"()\", y=" + solution.isValid("()"));
        System.out.println("x=\"()[]{}\", y=" + solution.isValid("()[]{}"));
        System.out.println("x=\"(]\", y=" + solution.isValid("(]"));
        System.out.println("x=\"([)]\", y=" + solution.isValid("([)]"));
        System.out.println("x=\"{[]}\", y=" + solution.isValid("{[]}"));
    }
}
