package firstPass.easy._100;

import firstPass.structure.TreeNode;

/*
TreeNode的初步使用
First use of TreeNode

执行用时 : 0 ms, 在Same Tree的Java提交中击败了100.00% 的用户
内存消耗 : 33.4 MB, 在Same Tree的Java提交中击败了94.95% 的用户
 */

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == q;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isSameTree(TreeNode.createTestData("[1,2,3]"), TreeNode.createTestData("[1,2,3]")));
        System.out.println(solution.isSameTree(TreeNode.createTestData("[1,2]"), TreeNode.createTestData("[1,null,2]")));
        System.out.println(solution.isSameTree(TreeNode.createTestData("[1,2,1]"), TreeNode.createTestData("[1,1,2]")));
    }
}
