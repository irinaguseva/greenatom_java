-- CREATE TABLE employees (
--   id NUMBER,
--   surname VARCHAR(255),
--   experience NUMBER
-- );

-- INSERT INTO employees (id, surname, experience)
-- VALUES (1, 'Иванов', 10);

-- INSERT INTO employees (id, surname, experience)
-- VALUES (2, 'Петров', 12);

-- INSERT INTO employees (id, surname, experience)
-- VALUES (3, 'Сидоров', 14);

SELECT surname
FROM employees
WHERE experience < (SELECT MAX(experience) FROM employees)
ORDER BY experience DESC
LIMIT 1;
