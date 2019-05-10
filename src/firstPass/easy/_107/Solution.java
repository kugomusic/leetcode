package firstPass.easy._107;

import firstPass.structure.TreeNode;

import java.util.LinkedList;
import java.util.List;

/*
加入换行标志的二叉树层次遍历
Binary tree level traversal with symbol of wrap

进一步使用LinkedList及其嵌套形式，了解它的各种方法
Further use LinkedList and its nested form, understand more methods

执行用时 : 4 ms, 在Binary Tree Level Order Traversal II的Java提交中击败了21.43% 的用户
内存消耗 : 36.3 MB, 在Binary Tree Level Order Traversal II的Java提交中击败了46.53% 的用户
 */

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
                // answer: add进去的是temp的地址（只有一个）
                // 创建temp的副本temp_copy, 将其添加进list即可
                LinkedList<Integer> temp_copy = new LinkedList<>();
                temp_copy.addAll(temp);
                ((LinkedList<List<Integer>>) list).addFirst(temp_copy);
                temp.clear();
                if (q.isEmpty()) {
                    break;
                }
                q.add(symbol);
                continue;
            }
            temp.add(currentNode.val);
            if (currentNode.left != null) {
                q.add(currentNode.left);
            }
            if (currentNode.right != null) {
                q.add(currentNode.right);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.levelOrderBottom(TreeNode.createTestData("[]")));
        System.out.println(solution.levelOrderBottom(TreeNode.createTestData("[1,2,2,3,4,4,3]")));
//        System.out.println(solution.levelOrderBottom(TreeNode.createTestData("[9,-42,-42,null,76,76,null,null,13,null,13]")));
    }
}
