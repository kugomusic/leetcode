package firstPass.easy._160;

import firstPass.structure.ListNode;

/*
计算两个链表的长度差，将较长链表的指针先移动n步（长度差），然后两个指针一起移动即可
Calculate the difference in length between the two linked lists, move the pointer of the longer list by n steps (length difference),
then move the two pointers together.

执行用时 : 2 ms, 在Intersection of Two Linked Lists的Java提交中击败了95.52% 的用户
内存消耗 : 47.8 MB, 在Intersection of Two Linked Lists的Java提交中击败了8.85% 的用户
 */

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        // 分别将a、b两个指针跳到最后一个节点，计算两个链表的长度以及长度差
        // Jump the two pointers a and b to the last node, calculate the length and length difference of the two linked lists
        int lenA = 1, lenB = 1;
        ListNode a = headA, b = headB;
        while (a.next != null) {
            a = a.next;
            lenA++;
        }
        while (b.next != null) {
            b = b.next;
            lenB++;
        }
        // 如果尾节点不一致，则直接返回null。 If do not have the same tail node, return null directly
        if (a != b) {
            return null;
        }
        int distance = lenA - lenB;
        // 根据长度差移动较长链表的头指针 Move the head pointer of the longer list according to the length difference
        if (distance >= 0) {
            while (distance-- > 0) {
                headA = headA.next;
            }
        } else {
            distance = Math.abs(distance);
            while (distance-- > 0) {
                headB = headB.next;
            }
        }
        // 两个指针一起移动，若指向同一个节点，返回该节点 Two pointers move together, if they point to the same node, return the node
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode headA = ListNode.createTestData("[4,1,8,4,5]");
        ListNode headB = ListNode.createTestData("[5,0,1,8,4,5]");
        headA.next.next = headB.next.next.next;
        System.out.println(solution.getIntersectionNode(headA, headB).val);
    }
}
