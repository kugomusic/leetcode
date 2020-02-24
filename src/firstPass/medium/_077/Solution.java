package firstPass.medium._077;

import java.util.LinkedList;
import java.util.List;

/*
回溯
backtrack
 */

/**
 * @description:
 * @author: tc
 * @create: 2020/02/24 16:41
 */
public class Solution {
    int n;
    int k;
    List<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        this.k = k;
        backtrack(1, new LinkedList<Integer>());

        return result;
    }

    private void backtrack(int first, LinkedList<Integer> curr) {
        if (curr.size() == k) {
            result.add(new LinkedList<>(curr));
        }
        for (int i = first; i < n + 1; ++i) {
            curr.add(i);
            backtrack(i + 1, curr);
            curr.removeLast();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.combine(4, 2));
    }
}
