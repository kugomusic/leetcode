package firstPass.easy._104;

import firstPass.structure.TreeNode;

/*
简单递归
Simple recursion

执行用时 : 1 ms, 在Maximum Depth of Binary Tree的Java提交中击败了91.30% 的用户
内存消耗 : 36.7 MB, 在Maximum Depth of Binary Tree的Java提交中击败了62.62% 的用户
 */

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxDepth(TreeNode.createTestData("[3,9,20,null,null,15,7]")));
    }
}
