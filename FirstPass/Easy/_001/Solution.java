package Easy._001;

import java.util.Arrays;

/*
暴力解法，直接两遍遍历
Violent solution, traversal two times

执行用时 : 129 ms, 在Two Sum的Java提交中击败了5.04% 的用户
内存消耗 : 37.3 MB, 在Two Sum的Java提交中击败了90.30% 的用户
 */
class Solution {

    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i != j && nums[i] + nums[j] == target){
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");      // 暂时不明白这行的意思（报错？如何将其具体使用？）
    }

    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }
}
