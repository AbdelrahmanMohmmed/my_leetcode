# Write your MySQL query statement below
with cte as((select requester_id id , count(*) num
from requestaccepted
group by requester_id)
union all
(
select accepter_id id , count(*) num
from requestaccepted
group by accepter_id
))
select id , sum(num) num
from cte
group by id
order by num desc
limit 1