package com.sgn08062.spring_myweb.util;

import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Data
public class PageVO {
    private int start; // 게시판 화면에 보여질 첫페이지 번호
    private int end; // 게시판 화면에 보여질 끝페이지 번호
    private boolean prev; // 이전 버튼 활성화 여부
    private boolean next; // 다음 버트 활성화 여부

    private int page; // 현재 조회하는 페이지 번호
    private int amount; // 한 페이지에서 몇 개의 데이터를 보여줄 것인가
    private int total; // 총 게시물 수

    private int realEnd; //진짜 끝 번호
    private List<Integer> pageList; // 페이지 번호 리스트
    // 타임리프에서는 향상된 for구문 밖에 없어서 start - end까지 리스트에 저장

    private Criteria cri;

    public PageVO(Criteria cri, int total){
        this.cri = cri;
        this.total = total;
        this.page = cri.getPage();
        this.amount = cri.getAmount();

        // 1. 페이지 끝 번호 계산
        // 5번 페이지 조회 -> 끝 페이지 번호 10
        // 15번 페이지 조회 -> 끝 페이지 번호 20
        this.end = (int)Math.ceil((double)page/10.0) * 10;

        // 2. 시작번호
        this.start = end - 10 + 1;

        // 3. 진짜 끝 번호를 재계산
        // 만약 게시글 개수가 53개 -> 마지막 끝 페이지 번호는 6
        // 만약 게시글 개수가 174개 -> 마지막 끝 페이지 번호는 18
        this.realEnd = (int)Math.ceil(this.total/(double)amount);

        // 4. 제일 마지막 페이지 네이션일 경우는 realEnd로 변경
        // 304개 게시물 end - 10, 20, 30, 40, 50
        // realEnd - 31
        if(this.end > this.realEnd){
            this.end = this.realEnd;
        }

        // 5. 이전 버튼 활성화 여부
        // start -> 1, 11, 21, 31...
        this.prev = this.start > 1;

        // 6. 다음 버튼 활성화 여부
        this.next = this.realEnd > this.end;

        // 7. 페이지리스트 초기화
        this.pageList = IntStream.rangeClosed(this.start, this.end).boxed().collect(Collectors.toList());    }
}
