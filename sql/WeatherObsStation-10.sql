SELECT DISTINCT city
FROM Station
WHERE SUBSTRING(LOWER(REVERSE(city)), 1, 1) NOT IN ('a', 'e', 'i', 'o', 'u')