package firstPass.easy._235;

import firstPass.structure.TreeNode;

import java.util.Stack;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/10 14:02
 */

/*
执行用时 :19 ms, 在所有 Java 提交中击败了5.58%的用户
内存消耗 :42.3 MB, 在所有 Java 提交中击败了5.03%的用户
 */

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val > q.val) {
            TreeNode temp = p;
            p = q;
            q = temp;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            TreeNode now = stack.pop();
            if (now.val >= p.val && now.val <= q.val) {
                return now;
            }
            if (now.left != null) {
                stack.push(now.left);;
            }
            if (now.right != null) {
                stack.push(now.right);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lowestCommonAncestor(TreeNode.createTestData("[6,2,8,0,4,7,9,null,null,3,5]"), new TreeNode(2), new TreeNode(8)).val);
        System.out.println(solution.lowestCommonAncestor(TreeNode.createTestData("[6,2,8,0,4,7,9,null,null,3,5]"), new TreeNode(2), new TreeNode(4)).val);
    }
}
