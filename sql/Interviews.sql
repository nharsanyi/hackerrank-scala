SELECT * FROM (
                  SELECT contest_id, hacker_id, name, SUM(ts) as s1, SUM(tas) as s2, SUM(tv) as s3, SUM(tuv) as s4
                  FROM (
                           SELECT contest_id, hacker_id, name, chs.challenge_id, ts, tas, tv, tuv
                           FROM (
                                    SELECT distinct Contests.contest_id, hacker_id, name, challenge_id
                                    FROM Contests
                                             LEFT JOIN Colleges ON Contests.contest_id = Colleges.contest_id
                                             LEFT JOIN Challenges ON Challenges.college_id = Colleges.college_id
                                ) as chs
                                    LEFT JOIN (
                               SELECT challenge_id, SUM(total_views) as tv, SUM(total_unique_views) as tuv
                               FROM View_Stats
                               GROUP BY challenge_id
                           ) as vs ON chs.challenge_id = vs.challenge_id
                                    LEFT JOIN (
                               SELECT challenge_id, SUM(total_submissions) as ts, SUM(total_accepted_submissions) as tas
                               FROM Submission_Stats
                               GROUP BY challenge_id
                           ) as ss ON chs.challenge_id = ss.challenge_id
                       ) as f
                  GROUP BY contest_id, hacker_id, name
              ) as r
WHERE s1 + s2 + s3 + s4 > 0
ORDER BY contest_id