package firstPass.easy._189;

import java.util.Arrays;

/*
使用两个方法解此题，时间复杂度分别是O(kn)和O(n)
Use to methods to solve this question, time complexity are O(kn) and O(n)

思路 Thoughts：
方法一 Method 1:
每次整个数组向右移动一步，执行k次
Move the entire array one step to the right each time, execute k times
方法二 Method 2:
使用reverse方法辅助，reverse整个数组 --> reverse前半部分 --> reverse后半部分
Helped with function reverse, reverse entire array --> reverse the first half --> reverse the second half

方法一：
执行用时 : 132 ms, 在Rotate Array的Java提交中击败了30.71% 的用户
内存消耗 : 38.4 MB, 在Rotate Array的Java提交中击败了59.90% 的用户

方法二:
执行用时 : 1 ms, 在Rotate Array的Java提交中击败了96.96% 的用户
内存消耗 : 39.5 MB, 在Rotate Array的Java提交中击败了22.06% 的用户
 */

public class Solution {
//    public void rotate(int[] nums, int k) {
//        int len = nums.length;
//        k = k % len;
//        for (int i = 0; i < k; i++) {
//            int temp = nums[len - 1];
//            for (int j = len - 1; j > 0; j--) {
//                nums[j] = nums[j - 1];
//            }
//            nums[0] = temp;
//        }
//    }

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        reverse(nums, 0, len - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, len - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1,2,3,4,5,6,7};
        solution.rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
        int[] nums1 = new int[]{-1,-100,3,99};
        solution.rotate(nums1, 2);
        System.out.println(Arrays.toString(nums1));
    }
}
