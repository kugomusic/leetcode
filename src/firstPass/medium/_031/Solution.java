package firstPass.medium._031;

import java.util.Arrays;

/**
 * @description:
 * @author: tc
 * @create: 2019/08/19 11:28
 */

/*
从后往前遍历数组，若出现num[i - 1] < nums[i]，则从 i ~ nums.length - 1中找到比 nums[i - 1] 大的最小的数，与其交换；然后将 nums[i] ~ nums[nums.length - 1]进行升序排列；
若没有出现num[i - 1] < nums[i]，则说明数组是降序的，循环交换首尾元素使其升序即可
Traverse the array from the back to the front. If num[i - 1] < nums[i] appears, find the smallest number which is greater than nums[i - 1] from i ~ nums.length - 1 and exchange it with it; then sort nums[i] ~ nums[nums.length - 1] in ascending order;
If num[i - 1] < nums[i] does not appear, the array is in descending order, cyclically exchange the first and last elements to make them ascending

执行用时 :2 ms, 在所有 Java 提交中击败了89.33%的用户
内存消耗 :37.6 MB, 在所有 Java 提交中击败了86.64%的用户
 */

public class Solution {
    public void nextPermutation(int[] nums) {
        if (nums.length == 1) {
            return;
        }
        for (int i = nums.length - 1; i > 0 ; i--) {
            if (nums[i - 1] < nums[i]) {
                int aLittleBigNum = nums[i];
                int index = i;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] < aLittleBigNum && nums[j] > nums[i - 1]) {
                        aLittleBigNum = nums[j];
                        index = j;
                    }
                }
                nums[index] = nums[i - 1];
                nums[i - 1] = aLittleBigNum;
                Arrays.sort(nums, i, nums.length);
                return;
            }
        }
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] nums = new int[]{1,2,3};
//        int[] nums = new int[]{3,2,1};
//        int[] nums = new int[]{1,1,5};
        int[] nums = new int[]{1,3,2};
        solution.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
