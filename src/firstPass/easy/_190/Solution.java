package firstPass.easy._190;

/**
 * @description:
 * @author: tc
 * @create: 2019/06/28 16:39
 */

/*
解法一 Solution1：

直接调包，Integer.reverse
Use the package Integer directly

执行用时 : 4 ms, 在所有 Java 提交中击败了89.18%的用户
内存消耗 : 30.4 MB, 在所有 Java 提交中击败了5.27%的用户

解法二 Solution2：

位运算
Bit operation

执行用时 : 4 ms, 在所有 Java 提交中击败了89.18%的用户
内存消耗 : 30.1 MB, 在所有 Java 提交中击败了5.27%的用户
 */

public class Solution {
    // Solution1
//    public int reverseBits(int n) {
//        return Integer.reverse(n);
//    }

    // Solution2
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & 1) == 1) {
                result = (result << 1) + 1;
            }else {
                result = result << 1;
            }
            n = n >> 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseBits(2));
    }
}
