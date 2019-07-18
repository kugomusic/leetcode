package firstPass.easy._437;

import firstPass.structure.TreeNode;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/18 21:10
 */

/*
双重递归
Double recursion

执行用时 :19 ms, 在所有 Java 提交中击败了55.34%的用户
内存消耗 :37.4 MB, 在所有 Java 提交中击败了88.35%的用户
 */

public class Solution {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int result = 0;
        result += findNode(root, sum);
        result += pathSum(root.left, sum);
        result += pathSum(root.right, sum);
        return result;
    }

    /**
     * 功能描述:
     *      在以node为根节点的树中找所有符合条件的【以node为起点的】路径
     *      Find all satisfied [node-based] paths in the tree rooted at node
     * @param node
     * @param sum
     * @return: int
     * @Author: tc
     * @date: 2019/7/18 21:29
     */
    private int findNode(TreeNode node, int sum){
        if (node == null) {
            return 0;
        }
        int result = 0;
        if (node.val == sum) {
            result++;
        }
        result += findNode(node.left, sum - node.val);
        result += findNode(node.right, sum - node.val);
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.pathSum(TreeNode.createTestData("[10,5,-3,3,2,null,11,3,-2,null,1]"), 8));
    }
}
