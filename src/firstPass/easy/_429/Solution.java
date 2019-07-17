package firstPass.easy._429;

import firstPass.structure.Node;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/17 22:09
 */

/*
没看懂leetcode测试样例的输入，遗憾没有写出N叉树的构造方法
Did not understand the input of the leetcode test sample, unfortunately did not write the construction method of the N-tree

执行用时 :8 ms, 在所有 Java 提交中击败了47.60%的用户
内存消耗 :62.1 MB, 在所有 Java 提交中击败了5.12%的用户
 */

public class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            List<Integer> list = new LinkedList<>();
            while (count-- > 0) {
                Node node = queue.poll();
                list.add(node.val);
                for (Node child: node.children) {
                    queue.offer(child);
                }
            }
            result.add(list);
        }
        return result;
    }
}
