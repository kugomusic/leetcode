package firstPass.medium._002;

import firstPass.structure.ListNode;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/26 11:27
 */

/*
执行用时 :10 ms, 在所有 Java 提交中击败了71.35%的用户
内存消耗 :46.6 MB, 在所有 Java 提交中击败了74.19%的用户
 */

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        int carry = 0;
        while (p != null && q != null) {
            if (p.next == null && q.next != null) {
                p.next = new ListNode(0);
            }
            if (p.next != null && q.next == null) {
                q.next = new ListNode(0);
            }
            int sum = p.val + q.val + carry;
            carry = sum / 10;
            sum = sum % 10;
            p.val = sum;
            if (p.next == null && q.next == null && carry != 0) {
                p.next = new ListNode(carry);
            }
            p = p.next;
            q = q.next;
        }
        return l1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode.print(solution.addTwoNumbers(ListNode.createTestData("[2,4,3]"), ListNode.createTestData("[5,6,4]")));
        ListNode.print(solution.addTwoNumbers(ListNode.createTestData("[5]"), ListNode.createTestData("[5]")));
    }
}
