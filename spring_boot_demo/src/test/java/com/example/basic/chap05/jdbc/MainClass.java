package com.example.basic.chap05.jdbc;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MainClass {

    //객체를 얻을 때 sqlSession 객체를 사용함
//    @Autowired
//    SqlSession sqlSession;

    @Test
    public void test01(){
        //TestMapper tm = sqlSession.getMapper(TestMapper.class);
        //System.out.println("안녕하세요 오늘은:" + tm.getTime());
    }
}
