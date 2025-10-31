# 데이터베이스 생성문
CREATE DATABASE spring DEFAULT character SET 'UTF8';
# 계정생성
CREATE USER spring IDENTIFIED BY 'spring';
# 권한부여
GRANT ALL privileges ON spring.* TO spring;