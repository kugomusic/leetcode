package firstPass.easy._409;

import java.util.HashSet;
import java.util.Set;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/16 21:28
 */

/*
用set记录不能配对的字符
Use set to record characters that cannot be paired

执行用时 :15 ms, 在所有 Java 提交中击败了30.22%的用户
内存消耗 :35.9 MB, 在所有 Java 提交中击败了80.56%的用户
 */

public class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                set.remove(c);
            }else {
                set.add(c);
            }
        }
        if (set.isEmpty()) {
            return s.length();
        }
        return s.length() - set.size() + 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("abccccdd"));
    }
}
