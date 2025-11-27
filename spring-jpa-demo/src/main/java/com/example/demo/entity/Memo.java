package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "MEMO")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Memo {
    // 관계 N
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AutoIncrement
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_seq") // 시퀀스를 사용
    //@SequenceGenerator(name="my_seq", sequenceName = "시퀀스명") // 시퀀스를 생성
    private Long id;
    @Column(nullable = false, length = 200)
    private String writer;
    @Column(columnDefinition = "varchar(200) default 'y'") // 직접 칼럼관련 설정을 함
    private String text;


    // 매니 투 원 - N:1 조인
    @ManyToOne
    @JoinColumn(name = "member_id") // FK로 member_id로 추가함.
    private Member member;
}
