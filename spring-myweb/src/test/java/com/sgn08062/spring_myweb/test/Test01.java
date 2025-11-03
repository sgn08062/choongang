package com.sgn08062.spring_myweb.test;

import com.sgn08062.spring_myweb.command.ProductVO;
import com.sgn08062.spring_myweb.product.ProductMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test01 {

    @Autowired
    private ProductMapper productMapper;

    @Test
    public void test01(){
        new ProductVO();
        // 빌더패턴
        ProductVO vo = ProductVO.builder()
                .prodPrice(1000)
                .prodEnddate("2020-10-20")
                .prodWriter("테스트")
                .prodName("상품명")
                .build();
    }

//    // 테스트코드 insert
//    @Test
//    public void test02(){
//        for(int i=1;i<=100;i++){
//            ProductVO vo = ProductVO.builder()
//                    .prodName("ADMIN" + i)
//                    .prodWriter("decoy")
//                    .prodEnddate("2001-08-28")
//                    .prodPrice(1000*i)
//                    .prodCount(100*i)
//                    .prodComment("ADMIN" + i)
//                    .prodContent("admin" + i)
//                    .build();
//
//            productMapper.prodRegist(vo);
//        }
//    }
}
