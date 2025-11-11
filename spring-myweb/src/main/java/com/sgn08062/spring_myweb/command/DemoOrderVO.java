package com.sgn08062.spring_myweb.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DemoOrderVO {
    private int oid;
    private int mid; // fk 역할
    private String productName;

    // N:1 - 1 관계의 vo를 추가
    //private String name; // 가져올 칼럼이 하나인 경우는 이렇게 추가하는 방법도 고려
    private DemoMemberVO memberVO;
}
