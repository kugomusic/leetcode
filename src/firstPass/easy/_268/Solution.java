package firstPass.easy._268;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/10 19:09
 */

/*
数学题，算出总数逐个相减即可
Math problem, minus from sum one by one

执行用时 :2 ms, 在所有 Java 提交中击败了95.83%的用户
内存消耗 :48.4 MB, 在所有 Java 提交中击败了34.92%的用户
 */

public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for (int i = 0; i < n; i++) {
            sum -= nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.missingNumber(new int[]{3,0,1}));
    }
}
