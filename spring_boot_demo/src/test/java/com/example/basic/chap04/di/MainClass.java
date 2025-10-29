package com.example.basic.chap04.di;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootTest
public class MainClass {
    @Test // 이 메서드만 main메서드처럼 동작을 시험
    public void test01(){

    }

    // IOC 컨테이너
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    @Test
    public void test02(){
        // IOC 컨테이너에 미리 생성된 객체 확인
//        String[] arr = applicationContext.getBeanDefinitionNames();
//        System.out.println(Arrays.toString(arr));

        // 스프링에 미리 생성된 chef 객체 얻기
        Chef chef = applicationContext.getBean(Chef.class);
        System.out.println(chef.cook("pasta"));

        Hotel hotel = applicationContext.getBean(Hotel.class);
        Chef c = hotel.getChef();
        System.out.println(c.cook("라면!!!"));
    }
}
