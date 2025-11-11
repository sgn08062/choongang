package com.sgn08062.spring_myweb.product;

import com.sgn08062.spring_myweb.command.CategoryVO;
import com.sgn08062.spring_myweb.command.DemoMemberVO;
import com.sgn08062.spring_myweb.command.DemoOrderVO;
import com.sgn08062.spring_myweb.command.ProductVO;
import com.sgn08062.spring_myweb.util.Criteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductMapper {
    int prodRegist(ProductVO productVO);
    List<ProductVO> getList(@Param("prodWriter") String prodWriter,
                            @Param("cri") Criteria cri); // 조회
    int getTotal(@Param("prodWriter")String prodWriter,
                 @Param("cri") Criteria cri);
    ProductVO getDetail(long prodId);
    int prodUpdate(ProductVO productVO);
    int prodDelete(long prodId);

    List<CategoryVO> getCategory(); // 1단 카테고리
    List<CategoryVO> getCategoryChild(CategoryVO categoryVO); // 2단 카테고리


    // 조인연습
    List<DemoOrderVO> manyToOne(); // N:1
    DemoMemberVO oneToMany();

}
