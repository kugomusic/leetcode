package firstPass.easy._171;

/*
简单的26进制数
Simple 26-digit number

执行用时 : 6 ms, 在Excel Sheet Column Number的Java提交中击败了69.03% 的用户
内存消耗 : 35.4 MB, 在Excel Sheet Column Number的Java提交中击败了38.52% 的用户
 */

public class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            result = result * 26 + temp - 'A' + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.titleToNumber("A"));
        System.out.println(solution.titleToNumber("AB"));
        System.out.println(solution.titleToNumber("ZY"));
    }
}
