package firstPass.easy._438;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/19 15:32
 */

/*
用长度为p.length()的滑动窗口遍历s，需要注意从mapS里剔除脱离窗口的字符
Traversing String s with a sliding window of length p.length(), you need to be careful to remove characters behind window from the mapS

执行用时 :621 ms, 在所有 Java 提交中击败了11.48%的用户
内存消耗 :51.6 MB, 在所有 Java 提交中击败了25.91%的用户
 */

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s.length() < p.length()) {
            return list;
        }
        int len = p.length();
        Map<Character, Integer> mapS = new HashMap<>(len);
        Map<Character, Integer> mapP = new HashMap<>(len);
        for (int i = 0; i < len; i++) {
            char c = p.charAt(i);
            if (mapP.containsKey(c)) {
                mapP.replace(c, mapP.get(c) + 1);
            }else {
                mapP.put(c, 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i >= len) {
                char cPre = s.charAt(i - len);
                int value = mapS.get(cPre);
                if (mapS.get(cPre) == 1) {
                    mapS.remove(cPre);
                }else {
                    mapS.replace(cPre, value - 1);
                }
            }
            if (mapS.containsKey(c)) {
                mapS.replace(c, mapS.get(c) + 1);
            }else {
                mapS.put(c, 1);
            }
            if (mapP.equals(mapS)) {
                list.add(i - len + 1);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findAnagrams("cbaebabacd", "abc"));
        System.out.println(solution.findAnagrams("aa", "bb"));
    }
}
