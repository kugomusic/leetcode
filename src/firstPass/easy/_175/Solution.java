package firstPass.easy._175;

/*
INNER JOIN：如果表中有至少一个匹配，则返回行
LEFT JOIN：即使右表中没有匹配，也从左表返回所有的行
RIGHT JOIN：即使左表中没有匹配，也从右表返回所有的行
FULL JOIN：只要其中一个表中存在匹配，则返回行

使用LEFT JOIN
Use LEFT JOIN

执行用时 : 407 ms, 在Combine Two Tables的MySQL提交中击败了77.19% 的用户
内存消耗 : N/A
 */

public class Solution {
    // SQL语句如下
    String SQL = "SELECT Person.FirstName, LastName, Address.City, Address.State" +
                 "FROM Person" +
                 "LEFT JOIN Address" +
                 "ON Person.PersonId=Address.PersonId;";
}
