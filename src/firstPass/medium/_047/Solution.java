package firstPass.medium._047;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: tc
 * @create: 2019/08/23 10:02
 */

/*
在046的基础上加上剪枝以去除重复
Add pruning to the basis of problem 046 to remove duplication

执行用时 :5 ms, 在所有 Java 提交中击败了85.39%的用户
内存消耗 :43.3 MB, 在所有 Java 提交中击败了69.85%的用户
 */

public class Solution {

    private List<List<Integer>> result = new ArrayList<>();
    private boolean[] visited;

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        visited = new boolean[nums.length];
        backtrack(nums, new ArrayList<>());
        return result;
    }

    private void backtrack(int[] nums, List<Integer> list) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }else if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) {
                continue;
            }
            visited[i] = true;
            list.add(nums[i]);
            backtrack(nums, list);
            list.remove(list.size() -1);
            visited[i] = false;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.permuteUnique(new int[]{1,1,2}));
    }
}
