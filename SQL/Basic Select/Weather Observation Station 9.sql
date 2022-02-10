# Soal 14 - JAMPIROJAM
select distinct CITY from STATION where left(CITY,1) not in('a','e','i','o','u');

# Juga bisa gunakan LIKE
select distinct(CITY) from STATION where CITY not like 'a%' and CITY not like 'e%' and CITY not like 'i%' and CITY not like 'o%' and CITY not like 'u%';
