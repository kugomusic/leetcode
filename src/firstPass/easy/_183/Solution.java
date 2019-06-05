package firstPass.easy._183;

/*
使用LEFT JOIN，筛选出CustomerId为NULL的项，注意：NULL的判断不是用“=”，而是用“is”
Use LEFT JOIN, choose the items whose CustomerId is NULL. Take care: Determine if it is NULL, use "is NULL", not "= NULL"

执行用时 : 474 ms, 在Customers Who Never Order的MySQL提交中击败了91.42% 的用户
内存消耗 : N/A
 */

public class Solution {
    // SQL语句如下：
    String SQL = "SELECT Name AS Customers\n" +
                 "FROM Customers AS c\n" +
                 "lEFT JOIN Orders AS o\n" +
                 "ON c.Id=o.CustomerId\n" +
                 "WHERE o.CustomerId is NULL;";
}
