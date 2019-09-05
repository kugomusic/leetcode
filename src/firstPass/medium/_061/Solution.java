package firstPass.medium._061;

import firstPass.structure.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: tc
 * @create: 2019/09/05 14:18
 */

/*
借助list存储值，遍历两次
Store values by List, traversal twice

执行用时 :3 ms, 在所有 Java 提交中击败了13.06%的用户
内存消耗 :36.1 MB, 在所有 Java 提交中击败了82.48%的用户
 */

public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        int len = 0;
        List<Integer> list = new ArrayList<>();
        ListNode p = head;
        while (p != null) {
            len++;
            list.add(p.val);
            p = p.next;
        }
        if (k == 0 || k % len == 0) {
            return head;
        }else if (k > len) {
            k = k % len;
        }
        p = head;
        k = len - k;
        while (p != null) {
            p.val = list.get(k++ % len);
            p = p.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode.print(solution.rotateRight(ListNode.createTestData("[1,2,3,4,5]"), 2));
    }
}
