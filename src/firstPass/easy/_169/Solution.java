package firstPass.easy._169;

import java.util.HashMap;
import java.util.Map;

/*
借助map实现
Implemented with map

执行用时 : 39 ms, 在Majority Element的Java提交中击败了20.46% 的用户
内存消耗 : 50.4 MB, 在Majority Element的Java提交中击败了27.10% 的用户
 */

public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.get(num) == null) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }

        int half = nums.length / 2;
        for (Integer num : map.keySet()) {
            if (map.get(num) > half) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.majorityElement(new int[]{3,2,3}));
        System.out.println(solution.majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}
