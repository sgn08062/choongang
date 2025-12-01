package com.example.demo.jpa;

import com.example.demo.command.MemberMemoDTO;
import com.example.demo.repository.MemoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
public class JPACustomRepo03 {
    @Autowired
    MemoRepository memoRepository;

//    @Test
//    public void testCode01(){
//        memoRepository.updateTest("admin9", "업데이트함");
//    }

//    @Test
//    @Transactional
//    public void testCode02(){
//        List<Memo> list = memoRepository.mtoJoin1();
//        //System.out.println(list.toString());
//        System.out.println("조회결과: " + list.size());
//    }

//    @Test
//    public void testCode03(){
//        List<Object[]> list = memoRepository.mtoJoin2("abc");
//        for(Object[] obj:list){
//            Memo memo = (Memo)obj[0];
//            Member member = (Member)obj[1];
//
//            System.out.println("=================================");
//            System.out.println("Memo: " + memo);
//            System.out.println("Member: " + member);
//        }
//    }

//    @Test
//    public void testCode04(){
//        List<Object[]> list = memoRepository.mtoJoin3("노홍철");
////        for(Object[] obj:list){
////            Memo memo = (Memo)obj[0];
////            Member member = (Member)obj[1];
////
////            System.out.println("=================================");
////            System.out.println("Memo: " + memo);
////            System.out.println("Member: " + member);
////        }
//
//        list.forEach(row -> System.out.println(Arrays.toString(row)));
//    }

//    @Test
//    @Transactional
//    public void testCode05(){
//        List<Memo> list = memoRepository.mtoJoin4();
//
//        System.out.println(list.toString());
//    }

//    @Test
//    @Transactional
//    public void testCode06(){
//        Member m = memoRepository.otmJoin1("def");
//        System.out.println(m.toString());
//    }

    @Test
    @Transactional
    public void testCode07(){
        List<MemberMemoDTO> list = memoRepository.otmJoin2("abc");
        for(MemberMemoDTO memo:list){
            System.out.println(memo);
        }
    }
}
