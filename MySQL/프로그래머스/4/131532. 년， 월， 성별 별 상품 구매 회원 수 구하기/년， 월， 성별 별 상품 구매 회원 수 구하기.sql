-- 코드를 입력하세요
SELECT year(o.sales_date) as year, month(o.sales_date) as month, u.gender, count(distinct(u.user_id)) as users
from user_info u, online_sale o
where u.gender is not null and o.user_id = u.user_id
group by year(o.sales_date), month(o.sales_date),u.gender
order by  year,month,gender asc;