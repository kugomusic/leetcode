package firstPass.easy._350;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/12 18:25
 */

/*
执行用时 :4 ms, 在所有 Java 提交中击败了95.85%的用户
内存消耗 :36.4 MB, 在所有 Java 提交中击败了56.59%的用户
 */

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            Integer key = nums1[i];
            if (map.containsKey(key)) {
                map.replace(key, map.get(key) + 1);
            }else {
                map.put(key, 1);
            }
        }
        int[] result = new int[nums2.length];
        int p = 0;
        for (int i = 0; i < nums2.length; i++) {
            Integer key = nums2[i];
            if (map.containsKey(key) && map.get(key) != 0) {
                result[p++] = key;
                map.replace(key, map.get(key) - 1);
            }
        }
        return Arrays.copyOfRange(result, 0, p);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.intersect(new int[]{1,2,2,1}, new int[]{2,2})));
        System.out.println(Arrays.toString(solution.intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }
}
