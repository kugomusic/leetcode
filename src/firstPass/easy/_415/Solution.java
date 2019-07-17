package firstPass.easy._415;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/17 21:25
 */

/*
借助进位标志carry进行双指针加法
Double pointer addition with the carry flag

执行用时 :5 ms, 在所有 Java 提交中击败了92.09%的用户
内存消耗 :36.4 MB, 在所有 Java 提交中击败了85.98%的用户
 */

public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while (i >= 0 && j >= 0) {
            int res = num1.charAt(i) - '0' + num2.charAt(j) - '0' + carry;
            carry = res / 10;
            res = res % 10;
            sb.append(res);
            i--;
            j--;
        }
        while (i >= 0) {
            int res = num1.charAt(i) - '0' + carry;
            carry = res / 10;
            res = res % 10;
            sb.append(res);
            i--;
        }
        while (j >= 0) {
            int res = num2.charAt(j) - '0' + carry;
            carry = res / 10;
            res = res % 10;
            sb.append(res);
            j--;
        }
        if (carry == 1) {
            sb.append(1);
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addStrings("12", "234"));
    }
}
