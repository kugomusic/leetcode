package firstPass.easy._383;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/13 21:41
 */

/*
执行用时 :80 ms, 在所有 Java 提交中击败了18.64%的用户
内存消耗 :48.2 MB, 在所有 Java 提交中击败了32.77%的用户
 */

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>(16);
        for (int i = 0; i < magazine.length(); i++) {
            Character key = magazine.charAt(i);
            if (map.containsKey(key)) {
                map.replace(key, map.get(key) + 1);
            }else {
                map.put(key, 1);
            }
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            Character key = ransomNote.charAt(i);
            if (map.containsKey(key)) {
                Integer value = map.get(key);
                if (value == 0) {
                    return false;
                }else {
                    map.replace(key, value - 1);
                }
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canConstruct("a", "b"));
        System.out.println(solution.canConstruct("aa", "ab"));
        System.out.println(solution.canConstruct("aa", "aab"));
    }
}
