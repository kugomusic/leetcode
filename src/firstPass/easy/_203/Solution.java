package firstPass.easy._203;

import firstPass.structure.ListNode;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/05 14:18
 */

/*
简单的单链表删除，需要在head前加两个前置指针
Simple deletion of single linked list, need two pointers before head pointer

执行用时 :1 ms, 在所有 Java 提交中击败了100.00%的用户
内存消耗 :39.3 MB, 在所有 Java 提交中击败了94.47%的用户
 */

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode result = pre;
        while (pre.next != null) {
            if (pre.next.val == val) {
                pre.next = pre.next.next;
            } else {
                pre = pre.next;
            }
        }
        return result.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode.print(solution.removeElements(ListNode.createTestData("[1,2,6,3,4,5,6]"), 6));
        ListNode.print(solution.removeElements(ListNode.createTestData("[1]"), 1));
        ListNode.print(solution.removeElements(ListNode.createTestData("[1,1]"), 1));
    }
}
