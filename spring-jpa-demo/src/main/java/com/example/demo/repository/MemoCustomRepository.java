package com.example.demo.repository;

import com.example.demo.command.MemberMemoDTO;
import com.example.demo.entity.Member;
import com.example.demo.entity.Memo;

import java.util.List;

public interface MemoCustomRepository {
    // 구현체가 가져야할 추상메서드 선언
    int updateTest(String writer, String text);
    // JPQL조인
    List<Memo> mtoJoin1();
    List<Object[]> mtoJoin2(String member_id);
    List<Object[]> mtoJoin3(String name);
    List<Memo> mtoJoin4();

    Member otmJoin1(String id);
    List<Member> otmJoin2(String id); // 원투매니 fetch
    MemberMemoDTO otmJoin3(String id); // 조인결과를 DTO로 받기

    // 쿼리 DSL
    Memo dslSelect();
    List<Memo> dslSelect2(); // 여러 행 조회
    List<Memo> dslSelect3(String searchType ,String searchName); // 불린빌더 동적쿼리
}
