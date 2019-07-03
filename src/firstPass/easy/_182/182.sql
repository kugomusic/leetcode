# SELECT DISTINCT a.Email
# FROM Person AS a,Person AS b
# WHERE a.Email=b.Email and a.Id!=b.Id

SELECT Email
FROM Person
GROUP BY Email
HAVING count(Email)>1