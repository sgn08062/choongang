package com.sgn08062.spring_myweb.util;

import lombok.Data;

@Data
public class Criteria {
    // 화면에 전달할 값들을 가지고 다닐 클래스
    private int page; // 현재 페이지 번호
    private int amount; // 데이터 개수

    // 검색 키워드
    private String searchName;
    private String searchContent;
    private String searchPrice;
    private String startDate;
    private String endDate;

    private String searchWriter;

    // 기본생성자
    public Criteria() {
        this(1, 10);
    }
    // 페이지 번호와 데이터개수를 전달받는 생성자
    public Criteria(int page, int amount) {
        this.page = page;
        this.amount = amount;
    }

    // limit 함수의 offset값 계산하는 getter
    public int getPageStart(){
        return (page - 1) * amount;
    }
}
