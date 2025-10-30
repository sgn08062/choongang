-------------------------------------------------------------------------
-- 스프링 계정 생성
CREATE USER SPRING IDENTIFIED BY SPRING;
-- 권한부여
GRANT CONNECT, RESOURCE TO SPRING;
-- 테이블 스페이스 연결
ALTER USER SPRING DEFAULT TABLESPACE USERS QUOTA UNLIMITED ON USERS;
-------------------------------------------------------------------------
