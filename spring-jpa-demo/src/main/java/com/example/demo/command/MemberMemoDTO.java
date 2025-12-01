package com.example.demo.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MemberMemoDTO {
    // 조인할 결과를 저장할 DTO
    // 멤버필드
    private String id;
    private String name;
    private LocalDateTime signDate;
    // 메모필드
    private String writer;
    private String text;
}
