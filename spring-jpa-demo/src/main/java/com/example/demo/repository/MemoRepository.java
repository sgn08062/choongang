package com.example.demo.repository;


import com.example.demo.entity.Memo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

// JpaRepository<엔티티, 엔티티의 ID>
public interface MemoRepository extends JpaRepository<Memo, Long> // 기본 jpa 인터페이스
                                        , MemoCustomRepository // 커스텀 리포지토리 사용시
                                        , QuerydslPredicateExecutor<Memo> { // 쿼리 dsl
    // 쿼리 메서드 - 메서드 이름을 보고 JPA가 sql을 실행시킴
    List<Memo> findByIdBetween(Long start, Long end);
    List<Memo> findByTextLike(String text);
    List<Memo> findByTextLikeOrderByIdDesc(String text);

    // SELECT * FROM MEMO WHERE WRITER IN ('10', '20', '30')
    List<Memo> findByWriterIn(List<String> writers);
    // SELECT * FROM MEMO WHERE TEXT LIKE '%12%' OR WRITER LIKE '%13%'
    List<Memo> findByTextLikeOrWriterLike(String text, String writer);

    // 쿼리메서드의 맨 마지막 매개변수에 Pageable객체를 전달하면 페이지 처리를 한다.
    Page<Memo> findByTextLikeOrWriterLike(String text, String writer, Pageable pageable);

    /// //////////////////////////////////////////////
    // JPQL - sql과 유사하나 엔티티를 사용
    // select, update, delete 사용할 수 있고, insert는 없음
    @Query("select m from Memo m order by m.id desc")
    List<Memo> getListDesc(); // 메서드명은 자유

    // 파라미터 전달 == :변수명
    @Query("select m from Memo m where m.writer like %:search% order by m.id desc")
    List<Memo> getListLike(@Param("search") String search);

    // select절을 선택적으로 저장하려면 반환을 Object[]
    @Query("select m.id, m.writer from Memo m order by m.writer")
    List<Object[]> getListAsc();

    // JPQL update - 객체 파라미터
    @Transactional
    @Modifying
    @Query("update Memo m set m.writer = :#{#a.writer},m.text = :#{#a.text} where m.id = :#{#a.id}")
    int updateMemo(@Param("a") Memo memo );

    // 마지막 매개변수에 Pageable을 넣어주면 페이지 처리
    @Query("select m from Memo m where m.id> :id")
    Page<Memo> getListJpa(@Param("id") Long id, Pageable pageable);

    // 네이티브 쿼리
    // JPQL구문으로 도저히 해결이 안되는 경우, sql구문으로 작성이 가능함
    @Query(value = "select * from memo where id > ? order by id desc",
     nativeQuery = true)
    List<Memo> getNativeQuery(Long id);


    // JPQL 조인 -> 커스텀 리포지토리에 옮겨도 상관없음
//    @Query("select m from Memo m inner join m.member")
//    List<Memo> mtoJoin1();
}