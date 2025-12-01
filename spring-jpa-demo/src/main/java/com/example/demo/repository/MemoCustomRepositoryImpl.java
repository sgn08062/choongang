package com.example.demo.repository;

import com.example.demo.command.MemberMemoDTO;
import com.example.demo.entity.Member;
import com.example.demo.entity.Memo;
import com.example.demo.entity.QMemo;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
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

    // 쿼리 dsl
    private JPAQueryFactory jpaQueryFactory;

    public MemoCustomRepositoryImpl(EntityManager em){
        this.jpaQueryFactory = new JPAQueryFactory(em);
    }

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

    //원투매니 fetch
    //1:N조인에서 fetch 사용시 행 중복현상이 발생할 수 있음
    //distinct키워드를 붙여서 중복행 제거

    @Override
    public List<Member> otmJoin2(String id) {
        String sql = "select distinct m from Member m join fetch m.list x where m.id = :id";
        TypedQuery<Member> query = em.createQuery(sql, Member.class);
        query.setParameter("id", id);
        return query.getResultList(); //여러행
    }
    //DTO로 처리하기
    //반환받을 값이 여러행이라면 List<MemberMemoDTO>

    @Override
    public MemberMemoDTO otmJoin3(String id) {
        //select절에는 MemberMemoDTO(생성자에 전달될값)
        String sql = "select new com.example.demo.command.MemberMemoDTO(m.id, m.name, m.signDate, x.writer, x.text)" +
                " from Member m join m.list x where m.id = :id";

        TypedQuery<MemberMemoDTO> query = em.createQuery(sql, MemberMemoDTO.class);
        query.setParameter("id", id);
        return query.getSingleResult(); //한행
    }

    @Override
    //쿼리DSL 기본문법
    public Memo dslSelect() {

        QMemo memo = QMemo.memo; //쿼리DSL을 자바sql문을 쓰기위한 클래스
        Memo m = jpaQueryFactory.select(memo) //select memo
                .from(memo) //from memo
                .where( memo.id.eq(10L) ) // where m.id = 10
                .fetchOne(); //1행조회
        return m;
    }

    @Override
    public List<Memo> dslSelect2() {

        QMemo memo = QMemo.memo;
        List<Memo> list = jpaQueryFactory.select(memo)
                .from(memo)
                //.where( memo.text.like("%2%") )
                //.where( memo.id.gt(10).and( memo.id.lt(20) )) // where id > 10 and id < 20
                .where ( memo.id.goe(10).or( memo.id.loe(20) )) //where id >= 10 or id <= 20
                .orderBy( memo.id.desc() )
                .fetch(); //여러행 조회

        //fetch() 여러행 조회, fetchOne() 단일행 execute() 인서트 업데이트 딜리트

        return list;
    }

    @Override
    public List<Memo> dslSelect3(String searchType, String searchName) {

        QMemo memo = QMemo.memo;
        //조건절을 불린빌더에 조합할 수 있습니다.
        BooleanBuilder builder = new BooleanBuilder();
        //검색의 조건이 writer면 writer like
        if(searchType != null && searchType.equals("writer") ) {
            builder.and( memo.writer.like( "%" + searchName + "%" ) );
        }
        //검색의 조건이 text면 text like
        if(searchType != null && searchType.equals("text") ) {
            builder.and( memo.text.like( "%" + searchName + "%" ) );
        }
        //...생략....
        List<Memo> list = jpaQueryFactory.select(memo)
                .from(memo)
                .where( builder )
                .fetch();

        return list;
    }
}
