package com.sgn08062.spring_myweb.controller;

import com.sgn08062.spring_myweb.command.CategoryVO;
import com.sgn08062.spring_myweb.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AjaxController {
    @Autowired
    @Qualifier("ProductService")
    private ProductService productService;


    // 대분류 카테고리 조회
    @GetMapping("/getCategory")
    public ResponseEntity<List<CategoryVO>> getCategory(){
        List<CategoryVO> category = productService.getCategory();
        return new ResponseEntity<>(category, HttpStatus.OK);
    }

    // 중분류 카테고리 조회
    @GetMapping("/getCategoryChild/{groupId}/{categoryLv}/{categoryDetailLv}")
    public ResponseEntity<List<CategoryVO>> getCategoryChild(@PathVariable("groupId") String groupId,
                                                             @PathVariable("categoryLv") int categoryLv,
                                                             @PathVariable("categoryDetailLv") int categoryDetailLv){
        CategoryVO vo = CategoryVO.builder().groupId(groupId)
                            .categoryLv(categoryLv)
                            .categoryDetailLv(categoryDetailLv)
                            .build();

        List<CategoryVO> category = productService.getCategoryChild(vo);
        return new ResponseEntity<>(category, HttpStatus.OK);
    }
}
