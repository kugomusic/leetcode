package firstPass.easy._083;

import firstPass.structure.ListNode;

/*
简单的排序链表应用
Simple application of sorted list

执行用时 : 2 ms, 在Remove Duplicates from Sorted List的Java提交中击败了69.88% 的用户
内存消耗 : 36 MB, 在Remove Duplicates from Sorted List的Java提交中击败了87.67% 的用户
 */

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        ListNode q = p;
        while (p != null){
            if (p.val != q.val){
                q.next = p;
                q = p;
            }
            p = p.next;
        }
        if (q != null){
            q.next = p;
        }
        return head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode data = ListNode.createTestData("1,1,2");
        ListNode.print(solution.deleteDuplicates(data));
        data = ListNode.createTestData("1,1,1,2,2,3,3,3");
        ListNode.print(solution.deleteDuplicates(data));
    }
}
