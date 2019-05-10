package firstPass.easy._107;

import firstPass.structure.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        List<Integer> temp = new LinkedList<>();
        LinkedList<TreeNode> q = new LinkedList<>();
        if (root == null) {
            return list;
        }
        q.add(root);
        // 换行标志 Symbol of wrap
        TreeNode symbol = new TreeNode(999);
        q.add(symbol);
        TreeNode currentNode;
        while (!q.isEmpty()) {
            currentNode = q.pop();
            if (currentNode == symbol) {

                // 此处为什么list加不进去temp？？

                list.add(temp);
                System.out.println(temp);
                System.out.println(list);
                temp.clear();
                if (q.isEmpty()) {
                    break;
                }
                q.add(symbol);
                continue;
            }
            temp.add(currentNode.val);
            System.out.println(currentNode.val);
            if (currentNode.left != null) {
                q.add(currentNode.left);
            }
            if (currentNode.right != null) {
                q.add(currentNode.right);
            }
        }
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.levelOrderBottom(TreeNode.createTestData("[]")));
        System.out.println(solution.levelOrderBottom(TreeNode.createTestData("[1,2,2,3,4,4,3]")));
//        System.out.println(solution.levelOrderBottom(TreeNode.createTestData("[9,-42,-42,null,76,76,null,null,13,null,13]")));
    }
}
