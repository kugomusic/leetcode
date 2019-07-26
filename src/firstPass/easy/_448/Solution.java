package firstPass.easy._448;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/26 10:55
 */

/*
将数组中数值的【绝对值-1】作为数组下标，对应位置的数置为【相应的负值】，数组中仍未正值的位置即为消失的数字
The [absolute value -1] of the value in the array is used as the index of the array, and the number of the corresponding position is set to [corresponding negative value],
and the position that is still not positive in the array is the disappearing number

[4,3,2,7,8,2,3,1] --> [-4,-3,-2,-7,[8],[2],-3,-1]

执行用时 :17 ms, 在所有 Java 提交中击败了24.19%的用户
内存消耗 :56.8 MB, 在所有 Java 提交中击败了35.50%的用户
 */

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            nums[Math.abs(nums[i]) - 1] = -Math.abs(nums[Math.abs(nums[i]) - 1]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }
}
