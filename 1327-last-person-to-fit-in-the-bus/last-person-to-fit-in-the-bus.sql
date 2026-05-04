# Write your MySQL query statement below
with cte as (
select *,sum(weight) over (order by turn) as wei
from queue
),cte2 as (
select *
from cte
where wei <= 1000
)
select person_name
from cte2
order by turn desc
limit 1