package com.example.demo.repository;

import com.example.demo.dto.MemberMemoDTO;
import com.example.demo.entity.Member;
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
        String sql = "select m from Memo m inner join m.member";
        //String sql = "select m from Memo m left join m.member";
        //String sql = "select m from Memo m right join m.member";
        TypedQuery<Memo> query = em.createQuery(sql, Memo.class); // 반환타입

        List<Memo> list = query.getResultList();
        return list;
    }

    @Override
    public List<Object[]> mtoJoin2(String member_id) {
        TypedQuery<Object[]> result = em.createQuery(
                "SELECT m, x FROM Memo m JOIN m.member x where x.id like :member_id"
                , Object[].class);

        result.setParameter("member_id", "%"+member_id+"%");
        List<Object[]> list = result.getResultList();

        return list;
    }

    @Override
    public List<Object[]> mtoJoin3(String name) {
        TypedQuery<Object[]> result = em.createQuery(
                "SELECT m, x FROM Memo m JOIN Member x On m.writer = x.name "
                +"where x.name = :name"
                ,Object[].class);

        result.setParameter("name", name);

        return result.getResultList();
    }

    @Override
    public List<Memo> mtoJoin4() {
        TypedQuery<Memo> result = em.createQuery(
                "SELECT m FROM Memo m JOIN FETCH m.member"
                ,Memo.class
        );

        return result.getResultList();
    }

    @Override
    public Member otmJoin1(String id) {
        TypedQuery<Member> result = em.createQuery(
                "SELECT m FROM Member m JOIN FETCH m.list x where m.id = :id"
                ,Member.class
        );

        result.setParameter("id", id);
        Member m = result.getSingleResult(); // 1행을 얻음

        return m;
    }

    @Override
    public List<MemberMemoDTO> otmJoin2(String id) {
        TypedQuery<MemberMemoDTO> result = em.createQuery(
                // select 순서를 생성자 순서에 반드시 맞춰야 한다.
                "SELECT new com.example.demo.dto.MemberMemoDTO(m.id, m.name, m.signDate, x.id, x.writer, x.text) "
                        // m.id와 x.id는 각각 Member 엔티티와 Memo엔티티의 id이다. DTO의 memberId, memoId가 아니다.
                + "FROM Member m JOIN m.list x WHERE m.id = :id"
                ,MemberMemoDTO.class
        );

        result.setParameter("id", id);
        return result.getResultList();
    }
}
