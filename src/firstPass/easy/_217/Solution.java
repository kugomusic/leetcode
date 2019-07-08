package firstPass.easy._217;

import java.util.HashSet;
import java.util.Set;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/08 11:08
 */

/*
使用HashSet检测重复
Use HashSet for duplicate detection

执行用时 :26 ms, 在所有 Java 提交中击败了28.55%的用户
内存消耗 :53 MB, 在所有 Java 提交中击败了17.94%的用户
 */

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.containsDuplicate(new int[]{1,2,3,1}));
    }
}
