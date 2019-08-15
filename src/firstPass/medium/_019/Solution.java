package firstPass.medium._019;

import firstPass.structure.ListNode;

/**
 * @description:
 * @author: tc
 * @create: 2019/08/15 13:40
 */

/*
双指针 Double pointers

执行用时 :1 ms, 在所有 Java 提交中击败了99.80%的用户
内存消耗 :35.1 MB, 在所有 Java 提交中击败了86.53%的用户
 */

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head;
        ListNode q = head;
        for (int i = 0; i < n; i++) {
            q = q.next;
        }
        while (q != null && q.next != null) {
            p = p.next;
            q = q.next;
        }
        if (q == null) {
            return p.next;
        }
        p.next = p.next.next;
        return head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode.print(solution.removeNthFromEnd(ListNode.createTestData("[1,2,3,4,5]"), 2));
        ListNode.print(solution.removeNthFromEnd(ListNode.createTestData("[1]"), 1));
    }
}
