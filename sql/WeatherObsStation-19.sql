with min_max AS (
    SELECT min(lat_n) as a, max(lat_n) as b, min(long_w) as c, max(long_w) as d from STATION
)
SELECT TRUNCATE(SQRT(POW(abs(a - b), 2) + POW(abs(c - d), 2)), 4) from min_max