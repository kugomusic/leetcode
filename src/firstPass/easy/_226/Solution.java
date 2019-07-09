package firstPass.easy._226;

import firstPass.structure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/09 15:11
 */

/*
Queue使用LinkedList来实现，但是要使用Queue类的offer和poll方法，否则会强转成LinkedList类型（这里相关知识点没有搞清楚，需要进一步学习）
Uses LinkedList to implement Queue, but I need to use the offer and poll methods of the Queue class, otherwise it will be strongly converted to the LinkedList type
(the relevant knowledge points are not clear here, need to learn further)

执行用时 :1 ms, 在所有 Java 提交中击败了89.52%的用户
内存消耗 :35.2 MB, 在所有 Java 提交中击败了38.83%的用户
 */

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode t = queue.poll();
            if (t.left != null) {
                queue.offer(t.left);
            }
            if (t.right != null) {
                queue.offer(t.right);
            }
            invert(t);
        }
        return root;
    }

    private void invert(TreeNode t) {
        TreeNode temp = t.left;
        t.left = t.right;
        t.right = temp;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode.printTree(solution.invertTree(TreeNode.createTestData("[4,2,7,1,3,6,9]")));
    }
}
