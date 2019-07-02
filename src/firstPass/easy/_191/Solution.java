package firstPass.easy._191;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/02 09:10
 */

/*
位运算
Bit operation

执行用时 : 76 ms, 在所有 Java 提交中击败了9.37%的用户
内存消耗 : 35.9 MB, 在所有 Java 提交中击败了5.14%的用户
 */

public class Solution {
    public int hammingWeight(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & 1) == 1) {
                result += 1;
                System.out.println(n);
                System.out.println(result);
            }
            n = n >> 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.hammingWeight(3));
    }
}
