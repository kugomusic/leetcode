package firstPass.easy._257;

import firstPass.structure.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/10 18:17
 */

/*
DFS

执行用时 :5 ms, 在所有 Java 提交中击败了20.53%的用户
内存消耗 :36.4 MB, 在所有 Java 提交中击败了97.17%的用户
 */

public class Solution {

    private List<Integer> list;
    private List<String> result;

    public List<String> binaryTreePaths(TreeNode root) {
        list = new LinkedList<>();
        result = new LinkedList<>();
        DFS(root);
        return result;
    }

    private void DFS(TreeNode root) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        if (root.left == null && root.right == null) {
            addTrace();
        }
        if (root.left != null) {
            DFS(root.left);
        }
        if (root.right != null) {
            DFS(root.right);
        }
        list.remove(list.size() - 1);
    }

    private void addTrace() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i != list.size() - 1) {
                sb.append("->");
            }
        }
        result.add(sb.toString());
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.binaryTreePaths(TreeNode.createTestData("[1,2,3,null,5]")));
    }
}
