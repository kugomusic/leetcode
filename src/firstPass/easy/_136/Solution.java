package firstPass.easy._136;

import java.util.HashMap;
import java.util.Map;

/*
暴力使用map，对于一个key：第一次出现时添加，第二次出现时删除，最后map里剩余的就是“只出现一次的数字”
Use map directly, for a key: the first time add and second time delete. The key remains in the map is the "number that only appears once"

执行用时 : 22 ms, 在Single Number的Java提交中击败了19.30% 的用户
内存消耗 : 43.4 MB, 在Single Number的Java提交中击败了14.72% 的用户
 */

public class Solution {
    public int singleNumber(int[] nums) {
        Map map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.remove(nums[i]);
            }
            else {
                map.put(nums[i], 1);
            }
        }
        Object[] list = map.keySet().toArray();
        return Integer.valueOf(list[0].toString());
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.singleNumber(new int[]{2,2,1}));
        System.out.println(solution.singleNumber(new int[]{4,1,2,1,2}));
    }
}
