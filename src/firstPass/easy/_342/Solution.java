package firstPass.easy._342;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/12 09:47
 */

/*
执行用时 :1 ms, 在所有 Java 提交中击败了100.00%的用户
内存消耗 :33.5 MB, 在所有 Java 提交中击败了13.56%的用户
 */

public class Solution {
    public boolean isPowerOfFour(int num) {
        if (num <= 0) {
            return false;
        }
        if (num == 1) {
            return true;
        }
        while (num > 1) {
            if (num % 4 != 0) {
                return false;
            }
            num /= 4;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfFour(16));
        System.out.println(solution.isPowerOfFour(5));
    }
}
