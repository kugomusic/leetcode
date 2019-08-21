package firstPass.medium._039;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: tc
 * @create: 2019/08/21 14:20
 */

/*
递归回溯+剪枝；递归的问题做起来有点困难，需要加强练习
Recursive backtracking and pruning; recursive problems are a bit difficult for me, intensive practice is required

执行用时 :8 ms, 在所有 Java 提交中击败了69.42%的用户
内存消耗 :40 MB, 在所有 Java 提交中击败了78.30%的用户
 */

public class Solution {

    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        for (int i = 0; i < candidates.length; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(candidates[i]);
            int remain = target - candidates[i];
            if (remain < 0) {
                break;
            }else if (remain == 0) {
                result.add(list);
                break;
            }else {
                findFromIndex(candidates, remain, i, list);
            }
        }
        return result;
    }

    private void findFromIndex(int[] candidates, int remain, int index, List<Integer> list) {
        if (remain == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (remain - candidates[i] < 0) {
                return;
            }
            list.add(candidates[i]);
            findFromIndex(candidates, remain - candidates[i], i, list);
            list.remove(list.size() -1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.combinationSum(new int[]{2,3,6,7}, 7));
        System.out.println(solution.combinationSum(new int[]{2,3,5}, 8));
    }
}
