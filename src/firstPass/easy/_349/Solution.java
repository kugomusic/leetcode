package firstPass.easy._349;

import java.util.*;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/12 16:06
 */

/*
使用Arrays.copyOfRange截取数组
Use Arrays.copyOfRange to intercept an array

执行用时 :9 ms, 在所有 Java 提交中击败了47.28%的用户
内存消耗 :37.7 MB, 在所有 Java 提交中击败了27.66%的用户
 */

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], false);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])) {
                map.replace(nums2[i], true);
            }
        }
        int[] result = new int[map.keySet().size()];
        int p = 0;
        for (Integer num:map.keySet()) {
            if (map.get(num)) {
                result[p++] = num;
            }
        }
        return Arrays.copyOfRange(result, 0, p);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.intersection(new int[]{1,2,2,1}, new int[]{2,2})));
        System.out.println(Arrays.toString(solution.intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }
}
