package firstPass.easy._172;

import java.math.BigInteger;

/*
使用BigInteger直接算阶乘超时。。。暴力破解失败
Use BigInteger to directly calculate the factorial, but timeout. . . Violent solve failed

只有2*5才能产生0，而2又比5多，所以数5的个数即可（注意：25=5*5，是两个5）
Only 2*5 generate 0, and number of 2 is more than 5, so the only thing we need to do is counting the number of 5;
Caution: 25=5*5, there are two 5s

执行用时 : 3 ms, 在Factorial Trailing Zeroes的Java提交中击败了96.75% 的用户
内存消耗 : 33.1 MB, 在Factorial Trailing Zeroes的Java提交中击败了81.55% 的用户
 */

public class Solution {
//    public int trailingZeroes(int n) {
//        int result = 0;
//        BigInteger temp = new BigInteger("1");
//        while (n > 1) {
//            temp = temp.multiply(new BigInteger(n + ""));
//            n--;
//        }
//        String str = temp.toString();
//        for (int i = str.length() - 1; i >= 0; i--) {
//            if (str.charAt(i) == '0') {
//                result++;
//            } else {
//                return result;
//            }
//        }
//        return result;
//    }

    public int trailingZeroes(int n) {
        if (n < 5) {
            return 0;
        }
        return n / 5 + trailingZeroes(n / 5);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.trailingZeroes(3));
        System.out.println(solution.trailingZeroes(5));
        System.out.println(solution.trailingZeroes(3534));
    }
}
