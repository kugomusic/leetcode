package firstPass.easy._182;

/*
HAVING为GROUP BY添加条件
HAVING add additions for GROUP BY

SQL:
执行用时 : 482 ms, 在Duplicate Emails的MySQL提交中击败了43.40% 的用户
内存消耗 : N/A

SQL1:
执行用时 : 504 ms, 在Duplicate Emails的MySQL提交中击败了37.82% 的用户
内存消耗 : N/A
 */

public class Solution {
    // SQL语句如下：
    String SQL = "SELECT DISTINCT a.Email " +
                 "FROM Person AS a,Person AS b " +
                 "WHERE a.Email=b.Email and a.Id!=b.Id;";

    String SQL1 = "SELECT Email " +
                  "FROM Person " +
                  "GROUP BY Email " +
                  "HAVING count(Email)>1;";
}
