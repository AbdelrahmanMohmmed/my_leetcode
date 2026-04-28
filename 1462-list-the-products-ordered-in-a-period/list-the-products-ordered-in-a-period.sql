# Write your MySQL query statement below
SELECT product_name,sum(unit) unit
from orders o
join products p 
on o.product_id = p.product_id
where DATE_FORMAT(order_date, "%Y%m") = '202002'
group by o.product_id
having sum(unit) >= 100