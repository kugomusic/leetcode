# 更改SQL类题目的记录方式： Solution.java --> xxx.sql

SELECT Person.FirstName, LastName, Address.City, Address.State
FROM Person
LEFT JOIN Address
ON Person.PersonId=Address.PersonId