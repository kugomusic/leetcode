package firstPass.medium._050;

/**
 * @description:
 * @author: tc
 * @create: 2019/08/27 10:53
 */

/*
调包的快乐
Don't worry, be happy

执行用时 :2 ms, 在所有 Java 提交中击败了76.02%的用户
内存消耗 :33.7 MB, 在所有 Java 提交中击败了73.39%的用户
 */

public class Solution {
    public double myPow(double x, int n) {
        return Math.pow(x, n);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.myPow(2.00000, 10));
        System.out.println(solution.myPow(2.00000, -2));
    }
}
