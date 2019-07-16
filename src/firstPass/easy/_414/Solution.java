package firstPass.easy._414;

import java.util.TreeSet;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/16 21:48
 */

/*
借助SortedSet实现，TreeSet是其实现类，这里直接定义TreeSet是为了避免调用pollLast()方法时的强制转换类型
Helped with SortedSet, TreeSet is its implementation class, which directly defines the TreeSet to avoid the cast type when calling the pollLast() method

执行用时 :24 ms, 在所有 Java 提交中击败了8.62%的用户
内存消耗 :40.2 MB, 在所有 Java 提交中击败了23.21%的用户
 */

public class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        if (set.size() < 3) {
            return set.last();
        }
        set.pollLast();
        set.pollLast();
        return set.last();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.thirdMax(new int[]{3,2,1}));
        System.out.println(solution.thirdMax(new int[]{1,2}));
        System.out.println(solution.thirdMax(new int[]{2,2,3,1}));
    }
}
