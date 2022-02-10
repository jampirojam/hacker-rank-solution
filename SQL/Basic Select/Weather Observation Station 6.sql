# Soal 11 - JAMPIROJAM
select distinct CITY from STATION where left(CITY,1) in('a','e','i','o','u');

# Juga bisa gunakan LIKE
select distinct(CITY) from STATION where CITY like 'a%' or CITY like 'e%' or CITY like 'i%' or CITY like 'o%' or CITY like 'u%';
