package firstPass.easy._021;

import firstPass.structure.ListNode;

/*
链表的初步使用
First use of ListNode

执行用时 : 1 ms, 在Merge Two Sorted Lists的Java提交中击败了99.87% 的用户
内存消耗 : 35 MB, 在Merge Two Sorted Lists的Java提交中击败了93.86% 的用户
 */

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode p = res;
        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                p.next = l1;
                l1 = l1.next;
            }
            else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 != null){
            p.next = l1;
        }
        if (l2 != null){
            p.next = l2;
        }
        return res.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode0 = ListNode.createTestData("[1,2,4]");
        ListNode listNode1 = ListNode.createTestData("[1,3,4]");
        ListNode.print(listNode0);
        ListNode.print(listNode1);
        System.out.println("x=[1,2,4], [1,3,4], y=");
        ListNode.print(solution.mergeTwoLists(listNode0, listNode1));
    }
}
