package firstPass.medium._003;

import java.util.HashSet;
import java.util.Set;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/26 14:40
 */

/*
执行用时 :121 ms, 在所有 Java 提交中击败了20.58%的用户
内存消耗 :67.7 MB, 在所有 Java 提交中击败了12.71%的用户
 */

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = Math.max(result, maxLength(s, i));
        }
        return result;
    }

    private int maxLength(String s, int index) {
        Set<Character> set = new HashSet<>();
        int result = 0;
        for (int i = index; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                return result;
            }else {
                set.add(s.charAt(i));
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
    }
}
