package firstPass.medium._075;

import java.util.Arrays;

/**
 * @description:
 * @author: tc
 * @create: 2020/02/23 13:26
 */
public class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int current = 0;
        int end = nums.length - 1;
        while (current <= end) {
            if (nums[current] == 0) {
                swap(nums, start++, current++);
            }else if (nums[current] == 2) {
                swap(nums, current, end--);
            }else {
                current++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.sortColors(new int[]{1,2,0});
    }
}
