package firstPass.medium._018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: tc
 * @create: 2019/08/15 09:34
 */

/*
与015题类似，多套一层循环即可
Similar to problem 015, only need one more loop

执行用时 :76 ms, 在所有 Java 提交中击败了46.42%的用户
内存消耗 :44.5 MB, 在所有 Java 提交中击败了61.59%的用户
 */

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 &&nums[i] == nums[i - 1]) {
                continue;
            }
            int preJ = Integer.MAX_VALUE;
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (nums[j] == preJ) {
                    continue;
                }
                preJ = nums[j];
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int dif = nums[i] + nums[j] + nums[left] + nums[right] - target;
                    if (dif < 0) {
                        while (left < right && nums[left] == nums[++left]){}
                    }else if (dif > 0) {
                        while (left < right && nums[right] == nums[--right]){}
                    }else {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[++left]){}
                        while (left < right && nums[right] == nums[--right]){}
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
        System.out.println(solution.fourSum(new int[]{-3,-2,-1,0,0,1,2,3}, 0));
    }
}
