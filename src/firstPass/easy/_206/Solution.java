package firstPass.easy._206;

import firstPass.structure.ListNode;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/08 10:58
 */

/*
简单的单链表操作
Simple operation of single linked list

执行用时 :1 ms, 在所有 Java 提交中击败了87.70%的用户
内存消耗 :36.1 MB, 在所有 Java 提交中击败了55.86%的用户
 */

public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode preNode = null;
        while (head.next != null) {
            ListNode temp = head.next;
            head.next = preNode;
            preNode = head;
            head = temp;
        }
        head.next = preNode;
        return head;
    }

    public static void main(String[] args) {
        Solution solution  = new Solution();
        ListNode.print(solution.reverseList(ListNode.createTestData("1,2,3,4,5")));
    }
}
