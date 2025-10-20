-- DML
-- INSERT(삽입)
-- 2가지 방법
DESC DEPARTMENTS;

-- INSERT INTO 테이블명(컬럼명) VALUSE(값)
-- 컬럼명을 정확히 일치 시키면 컬럼명 생략이 가능함
INSERT INTO DEPARTMENTS VALUES (280, '개발자', NULL, 1700);

INSERT INTO DEPARTMENTS(DEPARTMENT_ID, DEPARTMENT_NAME, LOCATION_ID) 
VALUES (290, '디자이너', 1700);

ROLLBACK; -- 모든 DML문은 트랜잭션이 반영됨

-- INSERT도 서브쿼리 문장을 넣을 수 있다
CREATE TABLE EMPS AS (SELECT * FROM EMPLOYEES WHERE 1=2);
SELECT * FROM EMPS;

INSERT INTO EMPS(LAST_NAME, EMAIL, HIRE_DATE, JOB_ID)
(SELECT LAST_NAME, EMAIL, HIRE_DATE, JOB_ID FROM EMPLOYEES WHERE JOB_ID = 'SA_MAN');

INSERT INTO EMPS(LAST_NAME, EMAIL, HIRE_DATE, JOB_ID)
VALUES ( (SELECT LAST_NAME FROM EMPLOYEES WHERE MANAGER_ID IS NULL),
        'TEST', SYSDATE, 'TEST');
        
--------------------------------------------------------------------------------------------
-- UPDATE
SELECT * FROM EMPS;
UPDATE EMPS SET SALARY = 1000;

UPDATE EMPS SET SALARY = SALARY * 1.1,
                COMMISSION_PCT = 0.5,
                MANAGER_ID = 100
WHERE LAST_NAME = 'Russell';
-- UPDATE구문도 서브쿼리절이 허용된다.
UPDATE EMPS
SET (FIRST_NAME, MANAGER_ID, JOB_ID, DEPARTMENT_ID) = (SELECT FIRST_NAME, MANAGER_ID, JOB_ID, DEPARTMENT_ID FROM EMPLOYEES WHERE EMPLOYEE_ID = 103)
WHERE LAST_NAME = 'Russell';
-- WHERE 절에도 서브쿼리 가능
UPDATE EMPS
SET SALARY = 0
WHERE JOB_ID = (SELECT JOB_ID FROM EMPLOYEES WHERE DEPARTMENT);

----------------------------------------------------------------------------------------------------------------
-- DELETE
SELECT * FROM EMPS;

DELETE FROM EMPS
WHERE JOB_ID = 'IT_PROG';
-- 모든 행이 삭제 되는 것은 아니다. 테이블이 연관관계를 가지고 있다면, 참조무결성 제약에 위배되는 경우에 삭제되지 않는다.

COMMIT;

-------------------------------------------------------------------------------------------------------------------
-- MERGE문 - 데이터를 비교해서 있으면 UPDATE, 없으면 INSERT하는 형태로 사용됨
SELECT * FROM EMPS;

MERGE INTO EMPS E1 -- 타겟테이블
USING (SELECT * FROM EMPLOYEES WHERE JOB_ID='IT_PROG') E2-- 병합할 서브쿼리 문장
ON (E1.EMPLOYEE_ID = E2.EMPLOYEE_ID)
WHEN MATCHED THEN -- 일치할 때 처리할 구문
    UPDATE SET E1.SALARY = E2.SALARY,
        E1.COMMISSION_PCT = E2.COMMISSION_PCT
WHEN NOT MATCHED THEN -- 불일치할 때 처리할 구문
    INSERT (EMPLOYEE_ID, LAST_NAME, EMAIL, HIRE_DATE, JOB_ID)
    VALUES (E2.EMPLOYEE_ID, E2.LAST_NAME, E2.EMAIL, E2.HIRE_DATE, E2.JOB_ID);

-- 2ND 서브쿼리절로 다르 테이블을 가져오는게 아니고, 직접 데이터를 병합한다
MERGE INTO EMPS E1
USING DUAL
ON (E1.EMPLOYEE_ID = 105) -- 고유한 대상을 지정할 수 있는 키가 들어간다.
WHEN MATCHED THEN
    UPDATE SET E1.SALARY = 10000,
               E1.HIRE_DATE = SYSDATE
WHEN NOT MATCHED THEN
    INSERT (EMPLOYEE_ID, LAST_NAME, EMAIL, HIRE_DATE, JOB_ID)
    VALUES ( 203, 'TEST', 'TEST', SYSDATE, 'TEST');
    
    
-----------------------------------------------------------------------------------
CREATE TABLE EMPS2 AS (SELECT * FROM EMPS); -- 구조와 데이터 복사 (제약조건은 NOT NULL만)
CREATE TABLE EMPS2 AS (SELECT * FROM EMPS WHERE 1=2) -- 테이블 구조만 복사
SELECT * FROM EMPS2;


---------------------------------------------------------------------------
-- 연습문제
--문제 1.
--DEPTS테이블을 데이터를 포함해서 생성하세요.
--DEPTS테이블의 다음을 INSERT 하세요.
CREATE TABLE DEPTS AS (SELECT * FROM DEPARTMENTS WHERE 1=2);
SELECT * FROM DEPTS;
INSERT INTO DEPTS(DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID)
VALUES (280, '개발', NULL, 1800);

INSERT INTO DEPTS(DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID)
VALUES (290, '회계부', NULL, 1800);

INSERT INTO DEPTS(DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID)
VALUES (300, '재정', 301, 1800);

INSERT INTO DEPTS(DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID)
VALUES (320, '영업', 303, 1700);

--문제 2.
--DEPTS테이블의 데이터를 수정합니다
SELECT * FROM DEPTS;
--1. department_name 이 IT Support 인 데이터의 department_name을 IT bank로 변경
UPDATE DEPTS
SET DEPARTMENT_NAME = 'IT Bank'
WHERE DEPARTMENT_NAME = 'IT Support';
--2. department_id가 290인 데이터의 manager_id를 301로 변경
UPDATE DEPTS
SET MANAGER_ID = 301
WHERE DEPARTMENT_ID = 290;
--3. department_name이 IT Helpdesk인 데이터의 부서명을 IT Help로 , 매니저아이디를 303으로, 지역아이디를
--1800으로 변경하세요
UPDATE DEPTS
SET DEPARTMENT_NAME = 'IT Help', MANAGER_ID = 303, LOCATION_ID = 1800
WHERE DEPARTMENT_NAME = 'IT Helpdesk';
--4. 부서번호 (290, 300, 310, 320) 의 매니저아이디를 301로 한번에 변경하세요.
UPDATE DEPTS
SET MANAGER_ID = 301
WHERE DEPARTMENT_ID IN (290, 300, 310, 320);

--문제 3.
--삭제의 조건은 항상 primary key로 합니다, 여기서 primary key는 department_id라고 가정합니다.
SELECT * FROM DEPTS;
--1. 부서명 영업부를 삭제 하세요
--2. 부서명 NOC를 삭제하세요
DELETE FROM DEPTS
WHERE DEPARTMENT_ID IN (SELECT DEPARTMENT_ID FROM DEPTS WHERE DEPARTMENT_NAME='영업' OR DEPARTMENT_NAME='NOC');

--문제4
--1. Depts 사본테이블에서 department_id 가 200보다 큰 데이터를 삭제해 보세요.
DELETE FROM DEPTS
WHERE DEPARTMENT_ID > 200;
--2. Depts 사본테이블의 manager_id가 null이 아닌 데이터의 manager_id를 전부 100으로 변경하세요.
UPDATE DEPTS
SET MANAGER_ID = 100
WHERE MANAGER_ID IS NOT NULL;
--3. Depts 테이블은 타겟 테이블 입니다.
--4. Departments테이블은 매번 수정이 일어나는 테이블이라고 가정하고 Depts와 비교하여
--일치하는 경우 Depts의 부서명, 매니저ID, 지역ID를 업데이트 하고, 새로유입된 데이터는 그대로 추가해주는 merge문을 작성하세요.
MERGE INTO DEPTS D1
USING (SELECT * FROM DEPARTMENTS) D2
ON (D1.DEPARTMENT_ID = D2.DEPARTMENT_ID)
WHEN MATCHED THEN
UPDATE SET
D1.DEPARTMENT_NAME = D2.DEPARTMENT_NAME,
D1.MANAGER_ID = D2.MANAGER_ID,
D1.LOCATION_ID = D2.LOCATION_ID
WHEN NOT MATCHED THEN
INSERT VALUES (D2.DEPARTMENT_ID, D2.DEPARTMENT_NAME, D2.MANAGER_ID, D2.LOCATION_ID);

SELECT * FROM DEPTS;

--문제 5
--1. jobs_it 사본 테이블을 생성하세요 (JOBS 테이블의 min_salary가 6000보다 큰 데이터만 복사합니다)
--2. jobs_it 테이블에 아래 데이터를 추가하세요
--3. obs_it은 타겟 테이블 입니다
--jobs테이블은 매번 수정이 일어나는 테이블이라고 가정하고 jobs_it과 비교하여
--min_salary컬럼이 0보다 큰 경우 기존의 데이터는 min_salary, max_salary를 업데이트 하고 새로 유입된
--데이터는 그대로 추가해주는 merge문을 작성하세요.
CREATE TABLE JOB_IT AS (SELECT * FROM JOBS WHERE MIN_SALARY >= 6000);

MERGE INTO JOB_IT J1
USING (SELECT * FROM JOBS WHERE MIN_SALARY >= 6000) J2
ON(J1.JOB_ID = J2.JOB_ID)
WHEN MATCHED THEN
    UPDATE SET J1.MIN_SALARY = J2.MIN_SALARY, J1.MAX_SALARY = J2.MAX_SALARY
WHEN NOT MATCHED THEN
    INSERT VALUES(J2.JOB_ID, J2.JOB_TITLE, J2.MIN_SALARY, J2.MAX_SALARY);

COMMIT;