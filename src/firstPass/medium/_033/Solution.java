package firstPass.medium._033;

/**
 * @description:
 * @author: tc
 * @create: 2019/08/20 13:31
 */

/*
执行用时 :1 ms, 在所有 Java 提交中击败了99.83%的用户
内存消耗 :35.7 MB, 在所有 Java 提交中击败了87.21%的用户
 */

public class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        if (nums[0] == target) {
            return 0;
        }else if (nums[0] > target) {
            for (int i = nums.length - 1; i > 0; i--) {
                if (nums[i] == target) {
                    return i;
                }
                if (nums[i] < target) {
                    return -1;
                }
                if (i < nums.length - 1 && nums[i] > nums[i + 1]) {
                    return -1;
                }
            }
        }else {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == target) {
                    return i;
                }
                if (nums[i] > target || nums[i] < nums[i - 1]) {
                    return -1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.search(new int[]{4,5,6,7,0,1,2}, 0));
        System.out.println(solution.search(new int[]{4,5,6,7,0,1,2}, 3));
    }
}
