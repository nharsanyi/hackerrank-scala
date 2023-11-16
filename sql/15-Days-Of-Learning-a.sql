SELECT submission_date, unique_hackers, r.hacker_id, name
FROM (
         SELECT subs.submission_date, unique_hackers, MIN(hacker_id) as hacker_id
         FROM (
                  SELECT submission_date,
                         count(distinct hacker_id) as unique_hackers
                  FROM Submissions
                  GROUP BY submission_date
              ) as subs
                  LEFT JOIN (
             SELECT submission_date, hacker_id FROM (
                                                        SELECT submission_date, hacker_id,
                                                               count(submission_id) as c
                                                        FROM Submissions
                                                        GROUP BY submission_date, hacker_id
                                                    ) as all_counts
             WHERE c = (
                 SELECT MAX(c1)
                 FROM (
                          SELECT submission_date, hacker_id,
                                 count(submission_id) as c1
                          FROM Submissions
                          GROUP BY submission_date, hacker_id
                      ) counts
                 WHERE counts.submission_date = all_counts.submission_date
             )
         ) as stats
                            ON subs.submission_date = stats.submission_date
         GROUP BY subs.submission_date, unique_hackers
     ) as r
         LEFT JOIN Hackers
                   ON Hackers.hacker_id = r.hacker_id
ORDER By submission_date