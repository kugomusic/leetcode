package firstPass.easy._088;

import java.util.Arrays;

/*
一时调包一时爽，一直调包一直爽
Once calling once cool, always calling always coooooool

执行用时 : 2 ms, 在Merge Sorted Array的Java提交中击败了75.80% 的用户
内存消耗 : 34.9 MB, 在Merge Sorted Array的Java提交中击败了92.15% 的用户
 */

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++){
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{2,5,6};
        int n = 3;
        solution.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
