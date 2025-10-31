package com.sgn08062.spring_myweb.controller;

import com.sgn08062.spring_myweb.command.ProductVO;
import com.sgn08062.spring_myweb.product.ProductService;
import oracle.jdbc.proxy.annotation.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    @Qualifier("ProductService")
    private ProductService productService;

    @GetMapping("/productDetail")
    public String productDetail(){
        return "/product/productDetail";
    }

    @GetMapping("/productList")
    public String productList(){
        return "/product/productList";
    }

    @GetMapping("/productReg")
    public String productReg(){
        return "/product/productReg";
    }

    @PostMapping("/prodRegist")
    public String prodRegist(ProductVO productVO){
        System.out.println(productVO.toString());
        productService.prodRegist(productVO);
        return "redirect:/product/productList";
    }
}
