package firstPass.easy._263;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/10 19:02
 */

/*
执行用时 :6 ms, 在所有 Java 提交中击败了64.25%的用户
内存消耗 :34.6 MB, 在所有 Java 提交中击败了12.26%的用户
 */

public class Solution {
    public boolean isUgly(int num) {
        if (num == 0) {
            return false;
        }
        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }
        return num == 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isUgly(6));
        System.out.println(solution.isUgly(8));
        System.out.println(solution.isUgly(14));
    }
}
