package firstPass.easy._389;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/14 20:44
 */

/*
执行用时 :21 ms, 在所有 Java 提交中击败了11.29%的用户
内存消耗 :36.3 MB, 在所有 Java 提交中击败了69.38%的用户
 */

public class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>(16);
        for (int i = 0; i < s.length(); i++) {
            Character key = s.charAt(i);
            if (map.containsKey(key)) {
                map.replace(key, map.get(key) + 1);
            }else {
                map.put(key, 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            Character key = t.charAt(i);
            if (map.containsKey(key)) {
                Integer value = map.get(key);
                if (value == 0) {
                    return key;
                }else {
                    map.replace(key, value - 1);
                }
            }else {
                return key;
            }
        }
        return '0';
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findTheDifference("abcd", "abcde"));
    }
}
