package firstPass.easy._387;

import java.util.HashSet;
import java.util.Set;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/13 21:56
 */

/*
执行用时 :106 ms, 在所有 Java 提交中击败了20.85%的用户
内存消耗 :48.4 MB, 在所有 Java 提交中击败了36.56%的用户
 */

public class Solution {
    public int firstUniqChar(String s) {
        Set<Character> set = new HashSet<>();
        Set<Character> duplicateSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (set.contains(c)) {
                duplicateSet.add(c);
            }else {
                set.add(c);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (!duplicateSet.contains(s.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.firstUniqChar("leetcode"));
        System.out.println(solution.firstUniqChar("loveleetcode"));
    }
}
