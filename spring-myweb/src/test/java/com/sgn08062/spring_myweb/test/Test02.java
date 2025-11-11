package com.sgn08062.spring_myweb.test;

import com.sgn08062.spring_myweb.command.DemoMemberVO;
import com.sgn08062.spring_myweb.command.DemoOrderVO;
import com.sgn08062.spring_myweb.product.ProductMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class Test02 {
    @Autowired
    ProductMapper productMapper;

    @Test
    public void test01(){
        List<DemoOrderVO> list = productMapper.manyToOne();
        System.out.println(list.toString());

        DemoMemberVO list2 = productMapper.oneToMany();
        System.out.println(list2.toString());
    }
}
