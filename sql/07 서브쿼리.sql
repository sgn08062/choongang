-- 서브쿼리: SELECT절 안에 SELECT가 들어가는 유형
-- 단일행서브쿼리 - SELECT한 서브쿼리 결과가 1행인 서브쿼리
-- 서브쿼리 문법은 반드시 ()로 묶어준다. 연산자보다 오른쪽에 위치한다

-- 낸시보다 급여 많이 받은 사람은 누구냐?????????
--> 1.낸시 급여 확인 -> 2. 낸시 급여보다 큰 사람 찾음
SELECT CONCAT(FIRST_NAME, LAST_NAME), SALARY
FROM EMPLOYEES
WHERE SALARY > (SELECT SALARY FROM EMPLOYEES
                WHERE FIRST_NAME = 'Nancy');
                
-- 직원 아이디가 103인 사람과 동일한 직무를 가진 사람
SELECT FIRST_NAME
FROM EMPLOYEES
WHERE JOB_ID = ( SELECT JOB_ID FROM EMPLOYEES WHERE EMPLOYEE_ID = 103);

-- 스티븐 킹이랑 동일한 부서를 가진 사람들
SELECT *
FROM EMPLOYEES
WHERE DEPARTMENT_ID = (SELECT DEPARTMENT_ID FROM EMPLOYEES
                       WHERE FIRST_NAME = 'Steven' AND LAST_NAME = 'King');


--------------------------------------------------------------------------------
-- 다중행 서브쿼리 IN, ANY, ALL
-- IN - 정확히 일치하는 데이터
-- ANY - 최솟값보다 큰 OR 최대값보다 작은
-- ALL - 최대값보다 큰 OR 최솟값보다 작은

-- 데이비드의 급여
SELECT SALARY FROM EMPLOYEES WHERE FIRST_NAME = 'David';
--4800보다 큰 사람들
SELECT *
FROM EMPLOYEES
WHERE SALARY >= ANY (SELECT SALARY FROM EMPLOYEES WHERE FIRST_NAME = 'David');
-- 9500보다 작은 사람들
SELECT *
FROM EMPLOYEES
WHERE SALARY <= ANY (SELECT SALARY FROM EMPLOYEES WHERE FIRST_NAME = 'David');

-- 9500보다 큰 사람들
SELECT *
FROM EMPLOYEES
WHERE SALARY >= ALL (SELECT SALARY FROM EMPLOYEES WHERE FIRST_NAME = 'David');

-- 4800보다 작은 사람들
SELECT *
FROM EMPLOYEES
WHERE SALARY <= ALL (SELECT SALARY FROM EMPLOYEES WHERE FIRST_NAME = 'David');

-- 정확히 일치하는 데이터
SELECT *
FROM EMPLOYEES
WHERE SALARY IN (SELECT SALARY FROM EMPLOYEES WHERE FIRST_NAME = 'David');