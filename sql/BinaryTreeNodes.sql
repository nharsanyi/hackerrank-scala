WITH input as (
    SELECT n, p from BST
),
parents as (
    SELECT DISTINCT p from BST
),
is_parent as (
    SELECT n, p,
    CASE WHEN n in (select * from parents) THEN 1
    ELSE 0
    END as is_parent
    FROM input
),
is_root as (
    SELECT *,
    CASE WHEN p is NULL THEN 1 ELSE 0 END as is_root
    from is_parent
)
select n,
CASE
    WHEN is_root = 1 THEN 'Root'
    WHEN is_parent = 1 THEN 'Inner'
    WHEN is_parent = 0 THEN 'Leaf' END
from is_root
ORDER BY n ASC