package firstPass.easy._283;

import java.util.Arrays;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/11 10:33
 */

/*
执行用时 :1 ms, 在所有 Java 提交中击败了94.60%的用户
内存消耗 :41.8 MB, 在所有 Java 提交中击败了38.80%的用户
 */

public class Solution {
    public void moveZeroes(int[] nums) {
        // 标志位，end前的都是非0序列
        // Flag, before the end are non-zero sequences
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            }else {
                if (end != i) {
                    nums[end] = nums[i];
                    nums[i] = 0;
                }
                end++;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{0,1,0,3,12};
        solution.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
