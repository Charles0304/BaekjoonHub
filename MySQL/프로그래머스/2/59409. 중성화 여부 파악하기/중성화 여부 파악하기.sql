-- 코드를 입력하세요
SELECT animal_id,name ,case when sex_upon_intake like "neutered%" or sex_upon_intake like "spayed%" then "O"
else "X" end
from animal_ins