package firstPass.easy._242;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/10 14:33
 */

/*
执行用时 :24 ms, 在所有 Java 提交中击败了26.41%的用户
内存消耗 :37.6 MB, 在所有 Java 提交中击败了95.80%的用户
 */

public class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (map.containsKey(c)) {
                map.replace(c, map.get(c) + 1);
            }else {
                map.put(c, 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            Character c = t.charAt(i);
            if (!map.containsKey(c)) {
                return false;
            }else {
                int res = map.get(c) - 1;
                if (res < 0) {
                    return false;
                }else if (res == 0) {
                    map.remove(c);
                }
                map.replace(c, res);
            }
        }
        return map.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isAnagram("anagram", "nagaram"));
        System.out.println(solution.isAnagram("rat", "car"));
    }
}
