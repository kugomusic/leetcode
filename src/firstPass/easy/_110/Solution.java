package firstPass.easy._110;

import firstPass.structure.TreeNode;

/*
简单的递归应用
Simple use of recursion

执行用时 : 2 ms, 在Balanced Binary Tree的Java提交中击败了95.45% 的用户
内存消耗 : 37.2 MB, 在Balanced Binary Tree的Java提交中击败了71.14% 的用户
 */

public class Solution {
    public boolean isBalanced(TreeNode root) {
        return balance(root) != -1;
    }

    // 辅助函数判断以root为根的二叉树是否为平衡二叉树，返回值0：平衡，-1：不平衡，n：高度（平衡）
    // The helper function judge whether the binary tree root is a balanced binary tree, returning a value of
    // 0: balanced, -1: unbalanced, n: height（balanced）
    public static int balance(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = balance(root.left);
        if (left == -1) {
            return -1;
        }
        int right = balance(root.right);
        if (right == -1) {
            return -1;
        }
        if (Math.abs(left - right) > 1) {
            return -1;
        }
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isBalanced(TreeNode.createTestData("[3,9,20,null,null,15,7]")));
        System.out.println(solution.isBalanced(TreeNode.createTestData("[1,2,2,3,3,null,null,4,4]")));
    }
}
