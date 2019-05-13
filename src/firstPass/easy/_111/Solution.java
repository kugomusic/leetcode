package firstPass.easy._111;

import firstPass.structure.TreeNode;

/*
简单的递归应用
Simple use of recursion

执行用时 : 1 ms, 在Minimum Depth of Binary Tree的Java提交中击败了93.97% 的用户
内存消耗 : 36.8 MB, 在Minimum Depth of Binary Tree的Java提交中击败了88.73% 的用户
 */

public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if (left != 0 && right != 0) {
            return Math.min(left, right) + 1;
        }
        return left + right + 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minDepth(TreeNode.createTestData("[3,9,20,null,null,15,7]")));
    }
}
