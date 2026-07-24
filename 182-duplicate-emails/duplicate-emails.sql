# Write your MySQL query statement below

/* SELECT DISTINCT(email)
FROM Person p1
WHERE email IN (
    SELECT email
    FROM Person p2
    WHERE p1.id != p2.id
); */

SELECT DISTINCT(p1.email)
FROM Person p1
JOIN Person p2 ON p1.email = p2.email
WHERE p1.id != p2.id;