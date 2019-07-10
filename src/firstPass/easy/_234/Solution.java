package firstPass.easy._234;

import firstPass.structure.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/10 09:36
 */

/*
使用双向队列进行比较；注意：Integer的比较需要使用equals()方法
Use a Dequeue for comparison; note: Integer comparison requires equals()

执行用时 :7 ms, 在所有 Java 提交中击败了25.25%的用户
内存消耗 :40.7 MB, 在所有 Java 提交中击败了97.70%的用户
 */

public class Solution {
    public boolean isPalindrome(ListNode head) {
        Deque<Integer> deque = new ArrayDeque<>();
        while (head != null) {
            deque.add(head.val);
            head = head.next;
        }
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(ListNode.createTestData("[1,2]")));
        System.out.println(solution.isPalindrome(ListNode.createTestData("[1,2,2,1]")));
    }
}
