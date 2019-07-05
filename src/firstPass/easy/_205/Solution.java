package firstPass.easy._205;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/05 18:29
 */

/*
key和value都是唯一的
Both key and value are unique

执行用时 :24 ms, 在所有 Java 提交中击败了36.45%的用户
内存消耗 :39.1 MB, 在所有 Java 提交中击败了28.84%的用户
 */

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c1 = s.charAt(i);
            Character c2 = t.charAt(i);
            if (!map.containsKey(c1)) {
                if (map.values().contains(c2)) {
                    return false;
                }
                map.put(c1, c2);
            }
            if (!map.get(c1).equals(c2)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isIsomorphic("egg", "add"));
        System.out.println(solution.isIsomorphic("foo", "bar"));
        System.out.println(solution.isIsomorphic("paper", "title"));
        System.out.println(solution.isIsomorphic("ab", "aa"));
    }
}
