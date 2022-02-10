# Soal 16 - JAMPIROJAM
select distinct CITY from STATION where right(CITY,1) not in('a','e','i','o','u') or left(CITY,1) not in('a','e','i','o','u');
