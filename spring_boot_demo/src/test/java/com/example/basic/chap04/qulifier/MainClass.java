package com.example.basic.chap04.qulifier;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MainClass {

	/*
	TODO
	1. IBattery를 구현체 Battery01 클래스를 만듭니다.
	2. MainClass에서 멤버변수 주입 시키고 Test메서드에서 확인하세요.
	*/

    @Autowired
    @Qualifier("베터리")
    IBattery battery01;


    @Test
    public void test01(@Qualifier("빳데리")  IBattery battery02) {
        System.out.println(battery01.getInfo());
        System.out.println(battery02.getInfo());
    }
}
