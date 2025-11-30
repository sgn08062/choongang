package com.example.demo.dto;

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
    private String memberId;
    private String name;
    private LocalDateTime signDate;
    private Long memoId;
    private String writer;
    private String text;
}
