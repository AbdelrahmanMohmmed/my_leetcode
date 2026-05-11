# Write your MySQL query statement below
select y.product_id , coalesce(x.new_price,10) price
from
(select *,
row_number() over (partition by product_id order by change_date desc) as _rn
from products
where change_date <= '2019-08-16') as x
right  join (select distinct(product_id)
from products) as y
on x.product_id = y.product_id
and x._rn = 1