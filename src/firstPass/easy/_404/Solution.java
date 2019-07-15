package firstPass.easy._404;

import firstPass.structure.TreeNode;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/15 22:06
 */

/*
sum为所有左枝叶子结点的和，采用DFS递归调用SumOfLeftLeaves()
sum is the sum of all left branch nodes, recursively calling SumOfLeftLeaves() with DFS

执行用时 :1 ms, 在所有 Java 提交中击败了99.25%的用户
内存消耗 :35.1 MB, 在所有 Java 提交中击败了79.79%的用户
 */

public class Solution {

    private int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.left != null) {
            if(root.left.left == null && root.left.right == null){
                sum += root.left.val;
            }else {
                sumOfLeftLeaves(root.left);
            }
        }
        sumOfLeftLeaves(root.right);
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.sumOfLeftLeaves(TreeNode.createTestData("[3,9,20,null,null,15,7]")));
    }
}
