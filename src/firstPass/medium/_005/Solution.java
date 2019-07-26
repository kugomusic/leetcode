package firstPass.medium._005;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/26 14:52
 */

/*
辅助函数：从以下标index为中心寻找回文串，需要注意的是，有aba和aa两种情况
User helper: Find the palindrome from the center(index). It should be noted that there are two cases of aba and aa

执行用时 :16 ms, 在所有 Java 提交中击败了73.27%的用户
内存消耗 :36.1 MB, 在所有 Java 提交中击败了91.33%的用户
 */

public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        int left = 0;
        int right = 0;
        for (int i = 0; i < s.length(); i++) {
            int lenaba = longestPalindromeFromCenter(s, i, i);
            int lenaa = longestPalindromeFromCenter(s, i, i + 1);
            int len  = Math.max(lenaba, lenaa);
            if (len > right - left + 1) {
                left = i - (len - 1) / 2;
                right = i + len / 2;
            }
        }
        return s.substring(left, right + 1);
    }

    private int longestPalindromeFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("babad"));
        System.out.println(solution.longestPalindrome("cbbd"));
        System.out.println(solution.longestPalindrome("ac"));
    }
}
