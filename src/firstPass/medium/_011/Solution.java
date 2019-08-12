package firstPass.medium._011;

/**
 * @description:
 * @author: tc
 * @create: 2019/08/12 14:57
 */

/*
执行用时 :380 ms, 在所有 Java 提交中击败了31.87%的用户
内存消耗 :45 MB, 在所有 Java 提交中击败了58.49%的用户
 */

public class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        if (height.length < 2) {
            return 0;
        }
        for (int i = 0; i < height.length - 1; i++) {
            result = Math.max(result, maxFromIndex(height, i));
        }
        return result;
    }

    private int maxFromIndex(int[] height, int index) {
        int max = 0;
        for (int i = index; i < height.length; i++) {
            int temp = Math.min(height[index], height[i]) * (i - index);
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
