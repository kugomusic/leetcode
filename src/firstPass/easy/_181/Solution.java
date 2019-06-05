package firstPass.easy._181;

/*
第一行的AS后面为列的别名，第二行的AS后面为表的别名
The alias after AS in the first row is for Column, another alias after AS in the second row is for Table

执行用时 : 932 ms, 在Employees Earning More Than Their Managers的MySQL提交中击败了27.43% 的用户
内存消耗 : N/A
 */

public class Solution {
    // SQL语句如下：
    String SQL = "SELECT Name AS Employee " +
                 "FROM Employee AS a " +
                 "WHERE Salary > (SELECT Salary FROM Employee WHERE Id=a.ManagerId);";
}
