package com.example.demo.repository;

import com.example.demo.dto.MemberMemoDTO;
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

    List<MemberMemoDTO> otmJoin2(String id);
}
