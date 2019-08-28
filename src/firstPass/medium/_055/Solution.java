package firstPass.medium._055;

/**
 * @description:
 * @author: tc
 * @create: 2019/08/28 16:41
 */

/*
从后往前遍历，判断从当前位置能否到达最后位置（当前数值 >= 步长）：若满足，截断后面的数组（将步长重置为1）；否则，步长自增并继续遍历。遍历完成后，步长为1则返回true，否则返回false
Traversing from back to front, judging whether the current position can reach the last position (nums[i] >= step):
if it is satisfied, truncating the following array (reset the step size to 1); otherwise, the step increments and continues to traverse.
Return true if step == 1 after the traversal is completed, otherwise return false

执行用时 :2 ms, 在所有 Java 提交中击败了97.52%的用户
内存消耗 :42.1 MB, 在所有 Java 提交中击败了69.22%的用户
 */

public class Solution {
    public boolean canJump(int[] nums) {
        int step = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] >= step) {
                step = 1;
            }else {
                step++;
            }
        }
        return step == 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canJump(new int[]{2,3,1,1,4}));
        System.out.println(solution.canJump(new int[]{3,2,1,0,4}));
    }
}
