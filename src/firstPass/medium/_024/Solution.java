package firstPass.medium._024;

import firstPass.structure.ListNode;

/**
 * @description:
 * @author: tc
 * @create: 2019/08/16 16:20
 */

/*
执行用时 :1 ms, 在所有 Java 提交中击败了83.47%的用户
内存消耗 :35.5 MB, 在所有 Java 提交中击败了47.71%的用户
 */

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode preNode = new ListNode(-1);
        preNode.next = swapNode(head);
        ListNode p = head.next;
        while (p != null) {
            head.next = swapNode(p);
            head = p;
            p = p.next;
        }
        return preNode.next;
    }

    private ListNode swapNode(ListNode p) {
        ListNode q = p.next;
        if (q == null) {
            return p;
        }
        p.next = q.next;
        q.next = p;
        return q;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode.print(solution.swapPairs(ListNode.createTestData("[1,2,3,4]")));
    }
}
