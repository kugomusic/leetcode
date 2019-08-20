package firstPass.medium._034;

import java.util.Arrays;

/**
 * @description:
 * @author: tc
 * @create: 2019/08/20 15:11
 */

/*
执行用时 :1 ms, 在所有 Java 提交中击败了97.86%的用户
内存消耗 :41.8 MB, 在所有 Java 提交中击败了77.30%的用户
 */

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        if (nums.length == 0) {
            return result;
        }
        int index = binarySearch(nums, target, 0, nums.length - 1);
        if (nums[index] != target) {
            return result;
        }
        for (int i = index; i < nums.length; i++) {
            if (nums[i] != target) {
                result[1] = i - 1;
                break;
            }
            if (i == nums.length - 1 && nums[i] == target) {
                result[1] = i;
                break;
            }
        }
        for (int i = index; i >= 0 ; i--) {
            if (nums[i] != target) {
                result[0] = i + 1;
                break;
            }
            if (i == 0 && nums[i] == target) {
                result[0] = 0;
                break;
            }
        }
        return result;
    }

    private int binarySearch(int[] nums, int target, int left, int right) {
        int result = -1;
        if (left >= right) {
            return left;
        }
        int mid = (left + right) / 2;
        if (nums[mid] == target) {
            return mid;
        }else if (nums[mid] > target) {
            result = binarySearch(nums, target, left, mid - 1);
        }else {
            result = binarySearch(nums, target, mid + 1, right);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.searchRange(new int[]{5,7,7,8,8,10}, 8)));
        System.out.println(Arrays.toString(solution.searchRange(new int[]{5,7,7,8,8,10}, 6)));
        System.out.println(Arrays.toString(solution.searchRange(new int[]{2,2}, 1)));
    }
}
