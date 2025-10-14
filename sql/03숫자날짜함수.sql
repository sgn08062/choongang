-- 숫자 함수
-- ROUND 반올림, TRUNC 절삭
SELECT ROUND(45.923, 2) FROM DUAL;
SELECT TRUNC(45.923, 2) FROM DUAL;
-- ABS 절대값, CEIL 올림, FLOOR 내림, MOD 나머지
SELECT ABS(-4), CEIL(3.14), FLOOR(3.14) FROM DUAL;
SELECT 5/2 문, MOD(5,2) 나머지 FROM DUAL;

-- 날짜 함수
SELECT SYSDATE, SYSTIMESTAMP FROM DUAL;

-- 날짜는 연산이 가능하다
SELECT HIRE_DATE, HIRE_DATE+10, HIRE_DATE-10 FROM EMPLOYEES; -- 날짜 +(-) 숫자 = 날짜
SELECT SYSDATE - HIRE_DATE FROM EMPLOYEES; -- 입사일로부처 며칠이 흘렀나
SELECT TRUNC((SYSDATE - HIRE_DATE)/7) FROM EMPLOYEES; -- 입사일로부터 몇 주가 흘렀나
SELECT TRUNC((SYSDATE - HIRE_DATE)/365) FROM EMPLOYEES; -- 입사일로부터 몇 년이 흘렀나
-- TRUNC, ROUND
SELECT TRUNC(SYSDATE) FROM DUAL; -- 일 기준 절삭
SELECT TRUNC(SYSDATE, 'MONTH') FROM DUAL; -- 월 기준 절삭
SELECT TRUNC(SYSDATE, 'YEAR') FROM DUAL; -- 연 기준 절삭

SELECT ROUND(SYSDATE) FROM DUAL; -- 일 기준 반올림
SELECT ROUND(SYSDATE, 'MONTH') FROM DUAL; -- 월 기준 반올림
SELECT ROUND(SYSDATE, 'YEAR') FROM DUAL; -- 연 기준 반올림

--변환함수
-- TO_CHAR 날짜 -> 문자로 변환
SELECT TO_CHAR(SYSDATE, 'YYYY MM DD')FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YY-MM-DD AM HH:MI:SS')FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YYYY"년" MM"월" DD"일"')FROM DUAL; -- 날짜 포멧이 아닌 값을 사용하려면 ""으로 감싸면 된다.

-- TO_CHAR 숫자 -> 문자로 변환
SELECT TO_CHAR(12345, '999999999') FROM DUAL; -- 자리수
SELECT TO_CHAR(12345, '099999999') FROM DUAL; -- 남는 자리에 0을 붙여줌
SELECT TO_CHAR(12345, '999') FROM DUAL; -- 자리부족시 #으로 표현됨
SELECT TO_CHAR(12345, '99999.999') FROM DUAL; -- 소수점 자리의 표현
SELECT TO_CHAR(12345, '$99999999') FROM DUAL; -- 달러기호
SELECT TO_CHAR(12345, 'L99999999') FROM DUAL; -- 지역화폐기호

-- TO_NUMBER 문자 -> 숫자
SELECT '20000' + 20000 FROM DUAL; -- 자동형변환
SELECT TO_NUMBER('20000') + 20000 FROM DUAL; -- 명시적형변환
SELECT '$5,500' + 2000 FROM DUAL;
SELECT TO_NUMBER('$5,500', '$99,999') + 2000 FROM DUAL;

-- TO_DATE 문자 -> 날짜
SELECT SYSDATE - TO_DATE('2024-10-14', 'YYYY-MM-DD') FROM DUAL;
SELECT TO_DATE('25/10/14 10:36:22', 'YYYY-MM-DD HH:MI:SS') FROM DUAL;
SELECT TO_DATE('2025년10월14일', 'YYYY"년"MM"월"DD"일"') FROM DUAL;

--------------------------------------------------------------------------------
-- NULL 처리 함수
-- NVL(값, 널일때 실행할 값)
SELECT NVL(NULL, 0) FROM DUAL;
SELECT FIRST_NAME, SALARY, SALARY + SALARY*NVL(COMMISSION_PCT,0) FROM EMPLOYEES;

--NVL2(값, 널이아닐때, 널일때)
SELECT NVL2(NULL, '널이 아닌', '널입니다') FROM DUAL;
SELECT FIRST_NAME, NVL2(COMMISSION_PCT, SALARY + SALARY * COMMISSION_PCT, SALARY) FROM EMPLOYEES;

--DECODE(값, 비교값, 결과값 ...., ELSE구문)
SELECT DECODE('B', 'A', 'A입니다', 'B', 'B입니다', 'C', 'C입니다', 'A~C가 아닙니다') FROM DUAL;
SELECT JOB_ID, DECODE(JOB_ID, 'IT_PROG', SALARY * 1.1
                , 'FI_MGR', SALARY * 1.2
                , SALARY) AS 급여
FROM EMPLOYEES;

-- CASE WHEN THEN
SELECT FIRST_NAME, JOB_ID,
    CASE JOB_ID WHEN 'AD_VP' THEN SALARY * 1.1
                WHEN 'IT_PROG' THEN SALARY * 1.2
                ELSE SALARY
    END AS 급여
FROM EMPLOYEES;
--2ND
SELECT FIRST_NAME, SALARY,
       CASE WHEN SALARY>=10000 THEN '고소득'
            WHEN SALARY>=5000 THEN '중위소득'
            ELSE '저소득'
       END AS GRADE
FROM EMPLOYEES;

--COALESCE - NULL이 아닌 첫번째 값을 반환
SELECT COALESCE(NULL, 'A', 'B') FROM DUAL;
SELECT COALESCE(NULL, NULL, 'B') FROM DUAL;
SELECT COALESCE(NULL, NULL, NULL) FROM DUAL;

----------------------------------------------------
--연습문제
--날짜 함수, 변환 함수 파트

--문제 1.
--1) 오늘의 환율이 1302.69원 입니다 SALARY컬럼을 한국돈으로 '원화기호999,999,999' 변경해서 소수점 2자리수까지 출력 하세요.
--2) '20250207' 문자를 '2025년 02월 07일' 로 변환해서 출력하세요.
SELECT TO_CHAR(SALARY*1302.69, 'L999,999,999.99') SALARY
    , TO_CHAR(TO_DATE('20250207', 'YYYYMMDD'), 'YYYY"년" MM"월" DD"일"') 날짜 FROM EMPLOYEES;

--문제 2.
--현재일자를 기준으로 EMPLOYEE테이블의 입사일자(hire_date)를 참조해서 근속년수가 10년 이상인
--사원을 다음과 같은 형태의 결과를 출력하도록 쿼리를 작성해 보세요. 
--조건 1) 근속년수가 높은 사원 순서대로 결과가 나오도록 합니다.
SELECT TRUNC((SYSDATE-HIRE_DATE)/365) 근속년수
FROM EMPLOYEES
WHERE ((SYSDATE-HIRE_DATE)/365) >= 10
ORDER BY 근속년수 DESC;
--문제 3.
--EMPLOYEE 테이블의 manager_id컬럼을 확인하여 first_name, manager_id, 직급을 출력합니다.
--100이라면 ‘부장’ 
--120이라면 ‘과장’
--121이라면 ‘대리’
--122라면 ‘주임’
--나머지는 ‘사원’ 으로 출력합니다.
--조건 1) 부서가 50인 사람들을 대상으로만 조회합니다
--조건 2) DECODE구문으로 표현해보세요.
--조건 3) CASE구문으로 표현해보세요.
SELECT FIRST_NAME, MANAGER_ID, DECODE(MANAGER_ID, 100, '부장', 120, '과장', 121, '대리', 122, '주임', '사원') 직급
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 50;

SELECT FIRST_NAME, MANAGER_ID, 
    CASE MANAGER_ID WHEN 100 THEN '부장'
                    WHEN 120 THEN '과장'
                    WHEN 121 THEN '대리'
                    WHEN 122 THEN '주임'
                    ELSE '사원'
    END AS 직급
FROM EMPLOYEES
WHERE DEPARTMENT_ID=50;
--문제 4. 
--EMPLOYEES 테이블의 이름, 입사일, 급여, 진급대상, 급여상태 를 출력합니다.
--조건1) HIRE_DATE를 XXXX년XX월XX일 형식으로 출력하세요. 
--조건2) 급여는 커미션값이 퍼센트로 더해진 값을 출력하고, 1300을 곱한 원화로 바꿔서 출력하세요.
--조건3) 진급대상은 5년 마다 이루어 집니다. 근속년수가 5의 배수라면 진급대상으로 출력합니다.
--조건4) 부서가 NULL이 아닌 데이터를 대상으로 출력합니다.
--조건5) 급여상태는 10000이상이면 '상' 10000~5000이라면 '중', 5000이하라면 '하' 로 출력해주세요.
SELECT TO_CHAR(HIRE_DATE, 'YYYY"년"MM"월"DD"일"') 입사일, 
        (SALARY + SALARY*NVL(COMMISSION_PCT, 0))*1300 급여,
        CASE WHEN MOD(TRUNC(((SYSDATE-HIRE_DATE)/365)),5)=0 THEN 'O'
                        ELSE 'X'
        END 진급대상,
        CASE WHEN SALARY>=10000 THEN '상'
            WHEN SALARY>=5000 THEN '중'
            ELSE '하'
        END 급여상태
FROM EMPLOYEES
WHERE DEPARTMENT_ID IS NOT NULL;
