# datediff(a,b) 返回a-b的天数

select w1.Id
from Weather w1,Weather w2
where datediff(w1.RecordDate,w2.RecordDate) = 1 and w1.Temperature > w2.Temperature