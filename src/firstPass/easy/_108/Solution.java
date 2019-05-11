package firstPass.easy._108;

import firstPass.structure.TreeNode;

/*
典型的分治题目，求mid的过程需要回头再手推一下
Typical divide and conquer problem, how to calculate mid needs to be considered later

执行用时 : 2 ms, 在Convert Sorted Array to Binary Search Tree的Java提交中击败了48.25% 的用户
内存消耗 : 37.9 MB, 在Convert Sorted Array to Binary Search Tree的Java提交中击败了58.56% 的用户
 */

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return buildTree(nums, 0, nums.length - 1);
    }

    public static TreeNode buildTree(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        // 为什么left + (right - left) / 2 优于 (right - left) / 2 ？溢出风险指的是什么？
        // Why left + (right - left) / 2 better than (right - left) / 2 ？What does the overflow risk mean?
        int mid = left + (right - left) / 2;
        TreeNode newNode = new TreeNode(nums[mid]);
        newNode.left = buildTree(nums, left, mid - 1);
        newNode.right = buildTree(nums, mid + 1, right);
        return newNode;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode.printTree(solution.sortedArrayToBST(new int[]{-10,-3,0,5,9}));
    }
}
