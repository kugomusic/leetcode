SELECT Name AS Customers
FROM Customers AS c
lEFT JOIN Orders AS o
ON c.Id=o.CustomerId
WHERE o.CustomerId is NULL