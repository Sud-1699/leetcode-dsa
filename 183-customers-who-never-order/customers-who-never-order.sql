# Write your MySQL query statement below

SELECT name as Customers
FROM Customers c
WHERE id NOT IN (
    SELECT customerId
    FROM Orders
);