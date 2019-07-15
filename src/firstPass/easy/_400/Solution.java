package firstPass.easy._400;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/14 20:53
 */

/*
拷贝的代码，懒得算数学题
The code is copied, math is boring

执行用时 :1 ms, 在所有 Java 提交中击败了98.11%的用户
内存消耗 :33.8 MB, 在所有 Java 提交中击败了78.62%的用户
 */

public class Solution {
    public int findNthDigit(int n) {
        long len = 1, base = 1;
        long m = n;
        while (m > 9 * base * len) {
            m -= 9 * base * len;
            len++;
            base *= 10;
        }
        int curNum = (int) (base + (m - 1) / len);
        return ((curNum + "").charAt((int) ((m - 1) % len)) - '0');
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findNthDigit(3));
    }
}
