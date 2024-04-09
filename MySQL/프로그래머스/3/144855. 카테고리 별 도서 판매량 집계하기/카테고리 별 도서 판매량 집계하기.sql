-- 코드를 입력하세요
SELECT b.category, sum(bs.sales) as total_sales
from book b,book_sales bs
where b.book_id = bs.book_id and year(bs.sales_date)=2022 and month(bs.sales_date)=1
group by b.category
order by b.category