package com.example.basic.chap04;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// base 패키지 밑에 클래스를 생성
@Service("bookService")
public class BookServiceImpl implements BookService {
    // 가짜 데이터베이스 ArrayList
    private List<BookVO> list = new ArrayList<BookVO>();
    private long newId = 1; //book 데이터를 관리할 pk

    public List<BookVO> list() {
        return list;
    }

    @Override
    public void bookRegist(BookVO bookVO) {
        bookVO.setId(newId);
        newId++;
        list.add(bookVO);
        System.out.println(bookVO.toString());
        System.out.println(list.toString());
    }

    @Override
    public void bookDelete(long id) {
        for(int i=0;i<list.size();i++){
            if(list.get(i).getId()==id){
                list.remove(i); // id가 같으면, 인덱스번째 데이터 삭제
                break;
            }
        }
    }
}
