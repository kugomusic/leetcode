package firstPass.medium._074;

/**
 * @description:
 * @author: tc
 * @create: 2019/10/15 15:28
 */

/*
二分查找；把二维数组平铺成一维数组，坐标的转换公式为：[index / n][index % n]
Binary search; flatten a two-dimensional array into a one-dimensional array, the coordinate conversion formula is: [index / n][index % n]

执行用时 :0 ms, 在所有 java 提交中击败了100.00%的用户
内存消耗 :40.6 MB, 在所有 java 提交中击败了70.78%的用户
 */

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int m = matrix.length;
         if (m == 0) {
             return false;
         }
         int n = matrix[0].length;
         if (n == 0) {
             return false;
         }
         int left = 0;
         int right = m * n - 1;
         while (left < right) {
             int mid = (left + right) / 2;
             int temp = matrix[mid / n][mid % n];
             if (temp == target) {
                 return true;
             }else if (temp > target) {
                 right = mid - 1;
             }else {
                 left = mid + 1;
             }
         }
         return matrix[left / n][left % n] == target;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.searchMatrix(new int[][]{
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,50},
        }, 3));
        System.out.println(solution.searchMatrix(new int[][]{
                {1,1}
        }, 2));
    }
}
