package com.sgn08062.spring_myweb.product;

import com.sgn08062.spring_myweb.command.ProductVO;

import java.util.List;

public interface ProductService {
    int prodRegist(ProductVO productVO);
    List<ProductVO> getList(String prodWriter);
    ProductVO getDetail(long prodId);
    int prodUpdate(ProductVO productVO);
    int prodDelete(long prodId);
}
