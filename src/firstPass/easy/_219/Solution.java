package firstPass.easy._219;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/08 11:16
 */

/*
使用Map，其中key用来判断重复元素，value记录索引
Use Map, key for duplicate detection, value for index recording

执行用时 :23 ms, 在所有 Java 提交中击败了79.38%的用户
内存消耗 :52.2 MB, 在所有 Java 提交中击败了12.17%的用户
 */

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            }else {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }else {
                    map.replace(nums[i], i);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.containsNearbyDuplicate(new int[]{1,2,3,1}, 3));
    }
}
