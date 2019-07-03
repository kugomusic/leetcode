SELECT Name AS Employee
FROM Employee AS a
WHERE Salary > (SELECT Salary FROM Employee WHERE Id=a.ManagerId)