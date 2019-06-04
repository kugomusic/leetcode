package firstPass.easy._176;

/*
SELECT DISTINCT 并且使用 ORDER BY 排序，对于结果输出第二条（LIMIT 1, 1: 从第二条开始，输出一条）
Use "SELECT DISTINCT" and "ORDER BY", select the second result using "LIMIT 1, 1", which means select 1 row starting from the second row

有一个坑：直接使用上述SQL，在不存在“第二高”的数据时，返回的是空数组[]，而不是题目要求的NULL
There is a problem: If use the SQL above, when the second highest salary does not exist, it returns [], not NULL required by the question
解决方法：在外面套一层SELECT, 当从空表中SELECT，返回的就是NULL
Solution: Write another SELECT outside, if we SELECT from an empty table, it returns NULL

执行用时 : 271 ms, 在Second Highest Salary的MySQL提交中击败了63.71% 的用户
内存消耗 : N/A
 */

public class Solution {
    // SQL语句如下：
    String SQL = "SELECT " +
                 "(SELECT DISTINCT Salary " +
                 "FROM Employee " +
                 "ORDER BY Salary DESC " +
                 "LIMIT 1, 1) " +
                 "AS SecondHighestSalary;";
}
