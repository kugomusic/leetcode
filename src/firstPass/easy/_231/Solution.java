package firstPass.easy._231;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/09 20:06
 */

/*
注意处理 n<=0 的情况即可
Pay attention to the case of n<=0

执行用时 :6 ms, 在所有 Java 提交中击败了82.12%的用户
内存消耗 :34.2 MB, 在所有 Java 提交中击败了11.97%的用户
 */

public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n != 1) {
            if (n % 2 == 1) {
                return false;
            }
            n /= 2;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfTwo(1));
        System.out.println(solution.isPowerOfTwo(16));
        System.out.println(solution.isPowerOfTwo(218));
    }
}
