package Easy._1;

import java.util.Arrays;

/*
暴力解法，直接两边遍历
Violent solution, traversal two times
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
