package com.sgn08062.spring_myweb.product;

import com.sgn08062.spring_myweb.command.ProductVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    int prodRegist(ProductVO productVO);
    List<ProductVO> getList(String prodWriter); // 조회
    ProductVO getDetail(long prodId);
    int prodUpdate(ProductVO productVO);
    int prodDelete(long prodId);

}
