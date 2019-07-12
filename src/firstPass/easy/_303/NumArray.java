package firstPass.easy._303;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/12 09:26
 */

/*
预计算前n个数字的和
Pre-calculate the sum of the first n numbers

执行用时 :109 ms, 在所有 Java 提交中击败了87.93%的用户
内存消耗 :46.1 MB, 在所有 Java 提交中击败了59.73%的用户
 */

public class NumArray {

    private int[] sums;

    public NumArray(int[] nums) {
        sums = new int[nums.length];
        if (nums.length == 0) {
            return;
        }
        sums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sums[i] = sums[i - 1] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        if (sums.length == 0) {
            return 0;
        }
        if (i == 0) {
            return sums[j];
        }
        return sums[j] - sums[i - 1];
    }

    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(numArray.sumRange(0, 2));
        System.out.println(numArray.sumRange(2, 5));
        System.out.println(numArray.sumRange(0, 5));
    }
}
