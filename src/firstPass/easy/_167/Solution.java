package firstPass.easy._167;

import java.util.Arrays;

/*
使用首尾两个指针
User head and tail pointers

执行用时 : 2 ms, 在Two Sum II - Input array is sorted的Java提交中击败了65.05% 的用户
内存消耗 : 38.6 MB, 在Two Sum II - Input array is sorted的Java提交中击败了23.91% 的用户
 */

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
