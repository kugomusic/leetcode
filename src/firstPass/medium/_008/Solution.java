package firstPass.medium._008;

import java.math.BigInteger;

/**
 * @description:
 * @author: tc
 * @create: 2019/08/12 09:53
 */

/*
执行用时 :11 ms, 在所有 Java 提交中击败了42.37%的用户
内存消耗 :36.8 MB, 在所有 Java 提交中击败了82.94%的用户
 */

public class Solution {
    public int myAtoi(String str) {

        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                continue;
            }else {
                if (c == '+') {
                    i++;
                }else if (c == '-' || (c >= '0' && c <= '9')) {
                    sb.append(c);
                    i++;
                }
                break;
            }
        }
        for (; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                sb.append(c);
            }else {
                break;
            }
        }
        if (sb.length() == 0 || "-".equals(sb.toString())) {
            return 0;
        }
        BigInteger result = new BigInteger(sb.toString());
        if (result.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0) {
            return Integer.MAX_VALUE;
        }else if (result.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) < 0) {
            return Integer.MIN_VALUE;
        }
        return result.intValue();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.myAtoi("42"));
        System.out.println(solution.myAtoi("   -42"));
        System.out.println(solution.myAtoi("4193 with words"));
        System.out.println(solution.myAtoi("words and 987"));
        System.out.println(solution.myAtoi("-91283472332"));
        System.out.println(solution.myAtoi(""));
        System.out.println(solution.myAtoi("-"));
        System.out.println(solution.myAtoi("3.14159"));
    }
}
