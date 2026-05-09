# Write your MySQL query statement below
(select name as results
from movierating mv
join users u
on mv.user_id = u.user_id
group by mv.user_id
order by count(*) desc , name asc
limit 1)
union all
(select title as results
from movierating mr
join movies m 
on mr.movie_id = m.movie_id
where DATE_FORMAT(created_at, '%Y-%m') = '2020-02'
group by mr.movie_id
order by avg(rating) desc , title asc
limit 1)