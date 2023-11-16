WITH daily as (
    SELECT submission_date, hacker_id,
           COUNT(*) OVER (PARTITION BY hacker_id ORDER BY submission_date) AS everyday_hackers
    FROM Submissions
    GROUP BY submission_date, hacker_id
),
 max_sub AS (
     SELECT submission_date, hacker_id,
            COUNT(*) as tot_submissions,
            RANK() OVER(partition by submission_date ORDER BY count(*) desc, hacker_id) AS rnk
     FROM Submissions
     GROUP BY hacker_id, submission_date
 )
SELECT d.submission_date, COUNT(d.hacker_id), ms.hacker_id, h.name
FROM daily d
JOIN max_sub ms ON ms.submission_date = d.submission_date
JOIN Hackers h on h.hacker_id = ms.hacker_id
WHERE d.everyday_hackers = DATEDIFF(DAY, '2016-03-01', d.submission_date) + 1 AND rnk = 1
GROUP BY d.submission_date, ms.hacker_id, h.name
ORDER BY d.submission_date