package firstPass.easy._053;

/*
暴力解法
Violent solution

执行用时 : 112 ms, 在Maximum Subarray的Java提交中击败了6.16% 的用户
内存消耗 : 40.3 MB, 在Maximum Subarray的Java提交中击败了66.48% 的用户
 */

public class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++){
            int temp = nums[i];
            int sum = temp;
            for (int j = i + 1; j < nums.length; j++){
                sum += nums[j];
                if (sum > temp){
                    temp = sum;
                }
            }
            if (temp > max){
                max = temp;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("[-2,1,-3,4,-1,2,1,-5,4], ans=6");
        System.out.println(solution.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
