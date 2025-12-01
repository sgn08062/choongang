package com.example.demo.util;

import lombok.Data;

@Data
public class Criteria {
    private int page;
    private int amount;

    // 검색키워드
    private String searchType;
    private String searchName;

    public Criteria() {
        this(1, 10);
    }

    public Criteria(int page, int amount){
        this.page = page;
        this.amount = amount;
    }

    // limit 0, 10 -> limit(페이지번호 - 1) * 데이터개수, 데이터개수
    public int getPageStart(){
        return (page - 1) * amount;
    }
}
