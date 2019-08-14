package firstPass.medium._016;

import java.util.Arrays;

/**
 * @description:
 * @author: tc
 * @create: 2019/08/14 10:28
 */

/*
与015的解题思路相似，使用双指针，遍历过程中有一定的优化
Solution is similar to the problem 015, using double pointers, there are certain optimizations in the traversal process

执行用时 :24 ms, 在所有 Java 提交中击败了16.75%的用户
内存消耗 :36.8 MB, 在所有 Java 提交中击败了84.01%的用户
 */

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = Integer.MAX_VALUE;
        int minDif = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int tempSum = proximateSumFromIndex(i, nums, target);
            int dif = Math.abs(tempSum - target);
            if (dif == 0) {
                return tempSum;
            }else if (dif < minDif) {
                result = tempSum;
                minDif = dif;
            }
        }
        return result;
    }

    private int proximateSumFromIndex(int index, int[] nums, int target) {
        int minDif = Integer.MAX_VALUE;
        int preDif = Integer.MAX_VALUE;
        int proximateSum = 0;
        for (int i = index + 1; i < nums.length - 1; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                int dif = Math.abs(nums[index] + nums[i] + nums[j] - target);
                if (dif < minDif) {
                    minDif = dif;
                    proximateSum = nums[index] + nums[i] + nums[j];
                }
                if (dif > preDif) {
                    preDif = Integer.MAX_VALUE;
                    break;
                }
                preDif = dif;
            }
        }
        return proximateSum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.threeSumClosest(new int[]{-1,2,1,-4}, 1));
//        System.out.println(solution.threeSumClosest(new int[]{1,1,1,0}, -100));
        System.out.println(solution.threeSumClosest(new int[]{84,58,16,-6,-34,72,96,56,-31,45,-6,53,-79,-43,-92,-88,3,16,-6,33,84,-62,0,-29,-88,58,-14,21,51,61,1,17,26,57,-55,39,95,50,-16,25,85,65,-25,23,-82,-85,-99,-20,34,89,67,93,60,-21,-87,47,62,-1,63,-96,75,94,81,-29,56,69,-78,49,36,-80,49,-26,3,-29,52,-77,38,31,-49,-100,-44,-60,62,-24,45,-88,63,-36,7,-99,22,18,77,11,9,-63,44,6,-30,71,-68,0,37,29,-68,71,-35,83,4,-3,-3,-100,-88,-19,3,92,-47,33,-61,-96,-23,51,87,2,26,72,38,-42,77,-43,17,83,-59,82,45,-81,-41,-58,30,-85,-67,51,-27,63,-54,83,-6,68,81,-17,24,-59,96,59,-78,48,-100,-81,25,-28,-82,15,-76,86,65,-48,-67,-20,90,-89,-89,9,1,46,-67,71,-51,69,-2,14,89,-89,-1,85,-20,-57,75,28,22,-35,81}, -48));
    }
}
