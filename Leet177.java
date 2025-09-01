

/**
* CREATE OR REPLACE FUNCTION NthHighestSalary(N INT) RETURNS TABLE (Salary INT) AS $$
 * BEGIN
* if (n>0) then
* RETURN QUERY (
*     -- Write your PostgreSQL query statement below.
*                 select (select distinct e1.salary from employee e1 order by salary desc limit 1 offset n-1) as getNthHighestSalary
*   );
* end if;
* END;
* $$ LANGUAGE plpgsql;
*/