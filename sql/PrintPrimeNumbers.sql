with recursive nums(n) AS
                   (
                       SELECT 1
                       UNION ALL
                       SELECT n+1
                       FROM nums
                       WHERE n < 1000
                   )

SELECT GROUP_CONCAT(nums.n SEPARATOR '&')
FROM nums
WHERE NOT EXISTS (
        SELECT n
        FROM nums AS factor
        WHERE factor.n > 1 AND factor.n < nums.n AND
                    nums.n % factor.n = 0
) AND nums.n > 1