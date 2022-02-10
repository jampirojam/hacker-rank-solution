# Soal 11 - JAMPIROJAM
select distinct CITY from STATION where left(CITY,1) in('a','e','i','o','u');

# Juga bisa gunakan LIKE
select distinct(CITY) from STATION where CITY like 'a%' or city like 'e%' or city like 'i%' or city like 'o%' or city like 'u%';
