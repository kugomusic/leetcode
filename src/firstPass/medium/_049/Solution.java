package firstPass.medium._049;

import java.util.*;

/**
 * @description:
 * @author: tc
 * @create: 2019/08/27 09:16
 */

/*
将字符串排序后作为key，借助map完成list的添加
Sort the string as a key, and complete list helped with map

执行用时 :22 ms, 在所有 Java 提交中击败了82.80%的用户
内存消耗 :52.3 MB, 在所有 Java 提交中击败了72.79%的用户
 */

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sortedStr = String.valueOf(chars);
            if (map.containsKey(sortedStr)) {
                List<String> list = map.get(sortedStr);
                list.add(strs[i]);
                map.put(sortedStr, list);
            }else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(sortedStr, list);
            }
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}
