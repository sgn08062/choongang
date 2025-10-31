package com.sgn08062.spring_myweb.product;

import com.sgn08062.spring_myweb.command.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ProductService")
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductMapper productMapper;
    @Override
    public int prodRegist(ProductVO productVO) {
        productMapper.prodRegist(productVO);
        return 0;
    }
}
