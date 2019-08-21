package firstPass.medium._040;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: tc
 * @create: 2019/08/21 15:58
 */

/*
与039思路相似，注意跳过相同数字即可
Similar to problem 039, pay attention to skip the same number

执行用时 :6 ms, 在所有 Java 提交中击败了90.19%的用户
内存消耗 :37.8 MB, 在所有 Java 提交中击败了87.31%的用户
 */

public class Solution {

    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        for (int i = 0; i < candidates.length; i++) {
            if (i > 0 && candidates[i] == candidates[i - 1]) {
                continue;
            }
            List<Integer> list = new ArrayList<>();
            list.add(candidates[i]);
            int remain = target - candidates[i];
            if (remain < 0) {
                break;
            }else if (remain == 0) {
                result.add(list);
                break;
            }else {
                findFromIndex(candidates, remain, i + 1, list);
            }
        }
        return result;
    }

    private void findFromIndex(int[] candidates, int remain, int index, List<Integer> list) {
        if (remain == 0) {
            result.add(new ArrayList<>(list));
        }
        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (remain - candidates[i] < 0) {
                break;
            }
            list.add(candidates[i]);
            findFromIndex(candidates, remain - candidates[i], i + 1, list);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8));
        System.out.println(solution.combinationSum2(new int[]{2,5,2,1,2}, 5));
    }
}
