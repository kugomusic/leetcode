package firstPass.easy._101;

import firstPass.structure.TreeNode;

import java.util.LinkedList;

/*
初步使用LinkedList，可用作栈或队列
First use of LinkedList, it can be used as Stack or Queue

区别 (difference)：
LinkList.add: linkLast (Stack), LinkedList.push: linkFirst (Queue)

执行用时 : 3 ms, 在Symmetric Tree的Java提交中击败了64.39% 的用户
内存消耗 : 34.3 MB, 在Symmetric Tree的Java提交中击败了95.30% 的用户
 */

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        LinkedList<TreeNode> q = new LinkedList<>();
        q.add(root.left);
        q.add(root.right);
        TreeNode left;
        TreeNode right;
        while (q.size() > 1) {
            left = q.pop();
            right = q.pop();
            if (left == null && right == null){
                continue;
            }
            if (left == null || right == null){
                return false;
            }
            if (left.val != right.val) {
                return false;
            }
            q.add(left.right);
            q.add(right.left);
            q.add(left.left);
            q.add(right.right);
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isSymmetric(TreeNode.createTestData("[1,2,2,3,4,4,3]")));
        System.out.println(solution.isSymmetric(TreeNode.createTestData("[1,2,2,null,3,null,3]")));
        TreeNode root = TreeNode.createTestData("[1,2,2,null,3,null,3]");
        TreeNode.printTree(root);
    }
}
