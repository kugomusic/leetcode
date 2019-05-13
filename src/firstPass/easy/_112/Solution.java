package firstPass.easy._112;

import firstPass.structure.TreeNode;

/*
简单的递归应用
Simple use of recursion

执行用时 : 1 ms, 在Path Sum的Java提交中击败了95.93% 的用户
内存消耗 : 37.3 MB, 在Path Sum的Java提交中击败了66.96% 的用户
 */

public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return root.val == sum;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.hasPathSum(TreeNode.createTestData("[5,4,8,11,null,13,4,7,2,null,null,null,1]"), 22));
    }
}
