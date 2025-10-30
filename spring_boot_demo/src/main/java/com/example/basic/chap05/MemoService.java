package com.example.basic.chap05;

import java.util.List;

public interface MemoService {
    List<MemoVO> list();
    void memoRegister(MemoVO memoVO);
}
