package com.example.demo.repository;

import com.example.demo.entity.Memo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class MemoCustomRepositoryImpl implements MemoCustomRepository {

    // 엔티티 매니저 - 영속성 영역에 접근 가능한 객체
    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional // insert, delete에서 꼭 적어야 함
    public int updateTest(String writer, String text) {
        // 자바 관련 프로그램 코드 작성
        String sql = "update Memo m set m.text = :a where m.writer = :b";

        Query query = em.createQuery(sql); // sql 구문 준비
        query.setParameter("a", text);
        query.setParameter("b", writer);
        // insert, update, delete는 executeUpdate() 문을 사용
        // select는 getResultList 혹은 getSingleResult 사용
        int result = query.executeUpdate();

        return result;
    }

    @Override
    public List<Memo> mtoJoin1() {
        //String sql = "select m from Memo m inner join m.member";
        //String sql = "select m from Memo m left join m.member";
        String sql = "select m from Memo m right join m.member";
        TypedQuery<Memo> query = em.createQuery(sql, Memo.class); // 반환타입

        List<Memo> list = query.getResultList();
        return list;
    }
}
