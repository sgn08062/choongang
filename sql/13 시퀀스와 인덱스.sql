SELECT * FROM USER_SEQUENCES;
SELECT * FROM EMPLOYEES;

-- 시퀀스 생성
CREATE SEQUENCE DEPTS_SEQ;
-- 시퀀스 삭제
DROP SEQUENCE DEPTS_SEQ;

CREATE SEQUENCE DEPTS_SEQ
    INCREMENT BY 1
    START WITH 50
    MAXVALUE 100
    NOCYCLE -- 시퀀스가 MAX에 도달하면 다시 시작부터 하겠는가?
    NOCACHE; -- 캐시에 시퀀스를 두지않음
    
-- 시퀀스는 일반적으로 PK에 자동증가하는 값으로 사용된다(인조 식별자)
DROP TABLE DEPTS;

CREATE TABLE DEPTS(
    DEPT_NO NUMBER(3) CONSTRAINT DEPT_NO_PK PRIMARY KEY,
    DEPT_NAME VARCHAR2(30)
);
SELECT DEPTS_SEQ.CURRVAL FROM DUAL; --NEXTVAL을 한번 실행한 후부터 사용가능
SELECT DEPTS_SEQ.NEXTVAL FROM DUAL;

INSERT INTO DEPTS VALUES(DEPTS_SEQ.NEXTVAL, 'DEPT');
SELECT * FROM DEPTS;

--시퀀스 수정 (CREATE -> ALTER로 변경)
ALTER SEQUENCE DEPTS_SEQ MAXVALUE 1000;
ALTER SEQUENCE DEPTS_SEQ INCREMENT BY 10 MINVALUE 1;

-- 주기적으로 시퀀스를 초기화 해야한다면?
-- 시퀀스가 이미 사용중인 경우라면, DROP하면 안된다.

-- 시퀀스 증가값을 음수로 변경
ALTER SEQUENCE DEPTS_SEQ INCREMENT BY -150 MINVALUE 0;
-- 시퀀스 전진
SELECT DEPTS_SEQ.NEXTVAL FROM DUAL;
-- 시퀀스 증가값을 1로 변경
ALTER SEQUENCE DEPTS_SEQ INCREMENT BY 1;
SELECT DEPTS_SEQ.NEXTVAL FROM DUAL;

-- 삭제
DROP SEQUENCE DEPTS_SEQ;
----------------------------------------------------------------------
-- 인덱스
-- INDEX는 PK, UK 제약에서 자동으로 생성된다. 조회를 빠르게하는 HINT 역할을 합니다
-- INDEX 종류로는 고유인덱스, 비고유인덱스가 있다
-- 고유 인덱스는 UNIQUE 컬럼에만 지정될 수 있다.
CREATE TABLE EMPS_IT AS (SELECT * FROM EMPLOYEES);

SELECT * FROM EMPS_IT WHERE FIRST_NAME = 'David';
-- FIRST_NAME에 인덱스 부착 (비고유 인덱스)
CREATE INDEX EMPS_IT_IDX ON EMPS_IT(FIRST_NAME);
SELECT * FROM EMPS_IT WHERE FIRST_NAME = 'David';
--인덱스 삭제
DROP INDEX EMPS_IT_IDX;
SELECT * FROM EMPS_IT WHERE FIRST_NAME = 'David';

-- 인덱스는 여러 칼럼을 묶어서 생성할 수 있다.
CREATE INDEX EMPS_IT ON EMPS_IT(FIRST_NAME, LAST_NAME);

SELECT * FROM EMPS_IT WHERE FIRST_NAME = 'David';
SELECT * FROM EMPS_IT WHERE FIRST_NAME = 'David' AND LAST_NAME = 'Lee';


----------------------------------------------------------------
--문제1.
--DEPTS_SEQ2테이블에 들어갈 수 있는 PK를 인조적으로 생성하려 합니다.
--값의 유형은
--2023-12-시퀀스값 입니다.
--1. DEPTS_SEQ2를 생성하세요.
--2. INSERT넣을 때 (2023-12-0000시퀀스) 일련번호 유형으로 들어갈 수 있도록 처리해보세요.
--	조건) 데이터는 (현재날짜-0000시퀀스) 유형입니다.
--	예시) 2023-12-00001, 2023-12-00002, 2023-12-00003......
--	힌트) SYSDATE, TO_CHAR, LPAD 사용
CREATE TABLE DEPS2(
    DEPT_NO VARCHAR2(30),
    DEPT_NAME VARCHAR2(30)
);
CREATE SEQUENCE DEPTS2_SEQ2 NOCACHE;

SELECT TO_CHAR(SYSDATE, 'YYYY-MM') || '-' || LPAD('X', 5, 0)
FROM DUAL;
INSERT INTO DEPS2 VALUES(TO_CHAR(SYSDATE, 'YYYY-MM') || '-' || LPAD(DEPTS2_SEQ2.NEXTVAL, 5, 0), 'TEST');

SELECT * FROM DEPS2;
--문제2.
--해가 지나서 시퀀스 값을 2024-01-시퀀스 형태로 초기화 하려고 합니다.
--문제1 에서 만든 시퀀스를 다시 1부터 시작하도록 초기화 해보세요.