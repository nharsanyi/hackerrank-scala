with occups as (
    SELECT Occupation,
           JSON_ARRAYAGG(Name) as names,
           count(*) as c,
           MAX(count(*)) OVER () as max_l
    FROM Occupations
    group by Occupation
),
     flatten as (
         SELECT t.res as name, Occupation, max_l
         from occups,
              json_table(occups.names, '$[*]' COLUMNS(res varchar(50) PATH '$' ))  t
     ),
     with_r as (
         SELECT name, Occupation, max_l, ROW_NUMBER() OVER (PARTITION BY Occupation ORDER BY name) as r
         from flatten
     ),
     doctors as (
         select * from with_r where Occupation = 'Doctor'
     ),
     professors as (
         select * from with_r where Occupation = 'Professor'
     ),
     singers as (
         select * from with_r where Occupation = 'Singer'
     ),
     actors as (
         select * from with_r where Occupation = 'Actor'
     ),
     d_p as (
         SELECT doctors.name as dn, professors.name as pn, professors.r as pr from  doctors
                                                                                        LEFT JOIN professors
                                                                                                  ON doctors.r = professors.r
         UNION
         SELECT doctors.name as dn, professors.name as pn, professors.r as pr from doctors
                                                                                       RIGHT JOIN professors
                                                                                                  ON doctors.r = professors.r
     ),
     d_p_s as (
         SELECT d_p.dn, d_p.pn, singers.name as sn, singers.r as sr from d_p
                                                                             LEFT JOIN singers on d_p.pr = singers.r
         UNION
         SELECT d_p.dn, d_p.pn, singers.name as sn, singers.r as sr from d_p
                                                                             RIGHT JOIN singers on d_p.pr = singers.r
     ),
     d_p_s_a as (
         SELECT d_p_s.dn, d_p_s.pn, d_p_s.sn, actors.name as an from d_p_s
                                                                         LEFT JOIN actors on d_p_s.sr = actors.r
         UNION
         SELECT d_p_s.dn, d_p_s.pn, d_p_s.sn, actors.name as an from d_p_s
                                                                         RIGHT JOIN actors on d_p_s.sr = actors.r
     )
SELECT * from d_p_s_a
