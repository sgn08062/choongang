package com.example.demo.jpa;

import com.example.demo.entity.Memo;
import com.example.demo.repository.MemoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

@SpringBootTest
public class JPAQueryMethod {
    @Autowired
    MemoRepository memoRepository;

//    @Test
//    public void testCode01(){
//        List<Memo> list = memoRepository.findByIdBetween(10L, 20L);
//        System.out.println(list.toString());
//    }

//    @Test
//    public void testCode02(){
//        List<Memo> list = memoRepository.findByTextLike("%1%");
//        System.out.println(list.toString());
//    }

//    @Test
//    public void testCode03(){
//        List<Memo> list = memoRepository.findByTextLikeOrderByIdDesc("%1%");
//        System.out.println(list.toString());
//    }

//    @Test
//    public void testCode04(){
//        Pageable pageable = PageRequest.of(0, 10);
//        Page<Memo> list = memoRepository.findByTextLikeOrWriterLike("%1%", "%2%", pageable);
//        System.out.println(list.getContent());
//    }

//    @Test
//    public void questionCode01(){
//        List<Memo> list = memoRepository.findByWriterIn(Arrays.asList("admin10", "admin20", "admin30"));
//        System.out.println(list.toString());
//    }

//    @Test
//    public void questionCode02(){
//        List<Memo> list = memoRepository.findByTextLikeOrWriterLike("%12%", "%13%");
//        System.out.println(list.toString());
//    }



    // JPQL
//    @Test
//    public void testCode05(){
//        //List<Memo> list = memoRepository.getListDesc();
//        //List<Memo> list = memoRepository.getListLike("10");
//        List<Object[]> list = memoRepository.getListAsc();
//        System.out.println(list.toString());
//    }

//    @Test
//    public void testCode06(){
//        Memo memo = Memo.builder().id(5L).writer("업데이트").text("업데이트").build();
//
//        int result = memoRepository.updateMemo(memo);
//        System.out.println("성공 여부: " + result);
//    }

//    @Test
//    public void testCode07(){
//        Pageable pageable = PageRequest.of(0, 10);
//        Page<Memo> page = memoRepository.getListJpa(5L, pageable);
//        System.out.println(page.getContent().toString());
//    }

    @Test
    public void testCode08(){
        List<Memo> list = memoRepository.getNativeQuery(10L);
        System.out.println(list);
    }
}
