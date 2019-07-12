package firstPass.easy._326;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/12 09:40
 */

/*
执行用时 :85 ms, 在所有 Java 提交中击败了71.13%的用户
内存消耗 :40.1 MB, 在所有 Java 提交中击败了13.86%的用户
 */

public class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        while (n > 1) {
            if (n % 3 != 0) {
                return false;
            }
            n /= 3;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfThree(27));
        System.out.println(solution.isPowerOfThree(0));
        System.out.println(solution.isPowerOfThree(9));
        System.out.println(solution.isPowerOfThree(45));
    }
}
