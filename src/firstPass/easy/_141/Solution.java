package firstPass.easy._141;

import firstPass.structure.ListNode;

/*
双指针不同步长遍历即可
Use two pointers with different step size to traversal the list

执行用时 : 1 ms, 在Linked List Cycle的Java提交中击败了91.87% 的用户
内存消耗 : 38.1 MB, 在Linked List Cycle的Java提交中击败了93.48% 的用户
 */

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode p = head;
        while (head != null && p != null) {
            head = head.next;
            if (p.next == null) {
                return false;
            }
            p = p.next.next;
            if (head == p) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.hasCycle(ListNode.createCircularLinkedList("[3,2,0,-4]",1)));
        System.out.println(solution.hasCycle(ListNode.createCircularLinkedList("[1,2]",0)));
        System.out.println(solution.hasCycle(ListNode.createCircularLinkedList("[1]",-1)));
    }
}
