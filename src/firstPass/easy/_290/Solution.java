package firstPass.easy._290;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/11 10:41
 */

/*
使用Map进行一一对应
Use Map for one-to-one correspondence

执行用时 :3 ms, 在所有 Java 提交中击败了79.75%的用户
内存消耗 :34.9 MB, 在所有 Java 提交中击败了34.61%的用户
 */

public class Solution {
    public boolean wordPattern(String pattern, String str) {
        Map<Character, String> map = new HashMap<>();
        String[] strs = str.split(" ");
        int len = pattern.length();
        if (len != strs.length) {
            return false;
        }
        for (int i = 0; i < len; i++) {
            Character key = pattern.charAt(i);
            String value = strs[i];
            if (map.containsKey(key)) {
                if (!map.get(key).equals(value)) {
                    return false;
                }
            }else {
                if (map.containsValue(value)) {
                    return false;
                }
                map.put(key, strs[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.wordPattern("abba", "dog cat cat dog"));
        System.out.println(solution.wordPattern("abba", "dog cat cat fish"));
        System.out.println(solution.wordPattern("aaaa", "dog cat cat dog"));
        System.out.println(solution.wordPattern("abba", "dog dog dog dog"));
    }
}
