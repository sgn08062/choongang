package com.example.demo.jpa;

import com.example.demo.entity.Memo;
import com.example.demo.repository.MemoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class JPACustomRepo03 {
    @Autowired
    MemoRepository memoRepository;

//    @Test
//    public void testCode01(){
//        memoRepository.updateTest("admin9", "업데이트함");
//    }

    @Test
    public void testCode02(){
        List<Memo> list = memoRepository.mtoJoin1();
        System.out.println(list.toString());
    }
}
