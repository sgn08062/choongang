package com.example.demo.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity // JPA가 이 클래스를 entity로 관리함
@Table(name="MEMBER") // 테이블명
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@ToString ToString 메서드는 하나 지운다
@EntityListeners(AuditingEntityListener.class)
public class Member {
    @Id // Pk 지정
    private String id;
    @Column(nullable = false, length = 50)
    private String name;
    @CreatedDate // JPA가 인서트시 날짜를 자동 입력( 프로젝트 시작점에 어노테이션 추가 )
    @Column(nullable = false)
    private LocalDateTime signDate;

    @OneToMany(mappedBy = "member", fetch = FetchType.LAZY) // 원투매니 기본조인 방식 - LAZY
    // Memo 엔티티의 멤버변수 member가 연관관계의 주인이다.
    @JsonIgnore // 이 필드는 json 변환시 무시됨
    // 양방향 매핑 무한 루프를 방지한다.
    // 혹은 응답 JSON에 비밀번호가 노출되지 않도록 보호한다.
    private List<Memo> list = new ArrayList<>();
}
