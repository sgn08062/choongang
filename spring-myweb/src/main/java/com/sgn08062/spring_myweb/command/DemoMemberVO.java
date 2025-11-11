package com.sgn08062.spring_myweb.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DemoMemberVO {
    private int mid;
    private String name;
    // 1:N조인에서는 list 선언
    List<DemoOrderVO> orderVO;
}
