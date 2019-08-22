package firstPass.medium._043;

import java.math.BigInteger;

/**
 * @description:
 * @author: tc
 * @create: 2019/08/22 09:36
 */

/*
数学题真的很没意思，直接调了BigInteger的包
Math problem is boring, call the package BigInteger

执行用时 :22 ms, 在所有 Java 提交中击败了29.78%的用户
内存消耗 :36.9 MB, 在所有 Java 提交中击败了89.05%的用户
 */

public class Solution {
    public String multiply(String num1, String num2) {
        BigInteger bigInteger1 = new BigInteger(num1);
        BigInteger bigInteger2 = new BigInteger(num2);
        return (bigInteger1.multiply(bigInteger2).toString());
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.multiply("2", "3"));
        System.out.println(solution.multiply("6913259244", "71103343"));
    }
}
