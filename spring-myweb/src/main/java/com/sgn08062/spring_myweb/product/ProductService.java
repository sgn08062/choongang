package com.sgn08062.spring_myweb.product;

import com.sgn08062.spring_myweb.command.ProductVO;
import com.sgn08062.spring_myweb.util.Criteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductService {
    int prodRegist(ProductVO productVO);
    //List<ProductVO> getList(String prodWriter);
    List<ProductVO> getList(String prodWriter, Criteria crit);
    int getTotal(String prodWriter, Criteria cri);
    ProductVO getDetail(long prodId);
    int prodUpdate(ProductVO productVO);
    int prodDelete(long prodId);
}
