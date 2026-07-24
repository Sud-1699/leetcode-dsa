# Write your MySQL query statement below

SELECT DISTINCT(email)
FROM Person p1
WHERE email IN (
    SELECT email
    FROM Person p2
    WHERE p1.id != p2.id
)