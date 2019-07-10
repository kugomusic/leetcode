package firstPass.easy._237;

import firstPass.structure.ListNode;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/10 14:17
 */

/*
本题目考察原地删除
This question examines the in situ deletion

执行用时 :1 ms, 在所有 Java 提交中击败了85.51%的用户
内存消耗 :36.7 MB, 在所有 Java 提交中击败了54.15%的用户
 */

public class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
