package firstPass.easy._035;

/*
结果较好，无需优化
No optimization required

执行用时 : 1 ms, 在Search Insert Position的Java提交中击败了97.61% 的用户
内存消耗 : 37.4 MB, 在Search Insert Position的Java提交中击败了89.19% 的用户
 */

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        if (len == 0){
            return 0;
        }
        for (int i = 0; i < len; i++){
            if (nums[i] >= target){
                return i;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("[1,3,5,6], 5\n" + solution.searchInsert(new int[]{1,3,5,6}, 5));
        System.out.println("[1,3,5,6], 2\n" + solution.searchInsert(new int[]{1,3,5,6}, 2));
        System.out.println("[1,3,5,6], 7\n" + solution.searchInsert(new int[]{1,3,5,6}, 7));
        System.out.println("[1,3,5,6], 0\n" + solution.searchInsert(new int[]{1,3,5,6}, 0));
        System.out.println("[1], 2\n" + solution.searchInsert(new int[]{1}, 2));
    }
}
