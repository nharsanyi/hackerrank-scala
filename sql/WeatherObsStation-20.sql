with input as (
    SELECT lat_n,
           count(*) OVER () as total_n,
           ROW_NUMBER() over (ORDER BY lat_n) as r
    from Station
),
     agg as (
         select
             *,
             FLOOR(total_n / 2) as l_i,
             FLOOR(total_n / 2) + 1 as h_i,
             MOD(total_n, 2) as m
         FROM input
     ),
     calc as (
         select
             CASE WHEN m = 1 THEN (SELECT lat_n FROM agg where r = h_i)
                  ELSE (SELECT AVG(lat_n) FROM agg WHERE r = h_i or r = l_i) END as result
         from agg
     )
SELECT TRUNCATE(result, 4) from calc LIMIT 1