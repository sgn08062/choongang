package com.example.basic.chap04;

import org.apache.ibatis.annotations.Mapper;

import java.awt.print.Book;
import java.util.List;

@Mapper
public interface BookMapper {
    List<BookVO> list();
    void bookRegist(BookVO bookVO);
    void bookDelete(long id);

}
