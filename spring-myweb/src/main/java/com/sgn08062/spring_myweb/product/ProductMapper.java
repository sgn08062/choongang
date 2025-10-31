package com.sgn08062.spring_myweb.product;

import com.sgn08062.spring_myweb.command.ProductVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {
    int prodRegist(ProductVO productVO);
}
