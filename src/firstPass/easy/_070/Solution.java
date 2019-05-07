package firstPass.easy._070;

/*
直接用斐波那契数列递归，超出了时间限制
Recursively using the Fibonacci sequence directly, beyond the time limit

复制了别人的代码，不明白为什么执行这么快，第二遍的时候好好研究一下
Copied someone else's code, don not understand why it's doing so fast, take a good look at the second time

执行用时 : 0 ms, 在Climbing Stairs的Java提交中击败了100.00% 的用户
内存消耗 : 33 MB, 在Climbing Stairs的Java提交中击败了72.47% 的用户
 */

public class Solution {
    public int climbStairs(int n) {
//        if (n <= 2){
//            return n;
//        }
//        else {
//            return climbStairs(n - 1) + climbStairs(n - 2);
//        }

        int a = 1, b = 1;
        while (--n > 0) {
            b += a;
            a = b - a;
        }
        return b;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.climbStairs(5));
    }
}
