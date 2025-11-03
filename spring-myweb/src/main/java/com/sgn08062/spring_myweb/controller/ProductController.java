package com.sgn08062.spring_myweb.controller;

import com.sgn08062.spring_myweb.command.ProductVO;
import com.sgn08062.spring_myweb.product.ProductService;
import oracle.jdbc.proxy.annotation.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    @Qualifier("ProductService")
    private ProductService productService;

    @GetMapping("/productDetail")
    public String productDetail(@RequestParam("prodId") long prodId, Model model) {
        System.out.println("상품의 아이디: " + prodId);

        model.addAttribute("vo", productService.getDetail(prodId));
        return "/product/productDetail";
    }

    // 목록화면
    @GetMapping("/productList")
    public String productList(Model model){
        String prodWriter = "decoy"; // 본인의 아이디라고 가정
        List<ProductVO> list = productService.getList(prodWriter);
        model.addAttribute("list",list);

        return "/product/productList";
    }

    @GetMapping("/productReg")
    public String productReg(){
        return "/product/productReg";
    }

    // 상품등록
    @PostMapping("/prodRegist")
    public String prodRegist(ProductVO productVO, RedirectAttributes redirectAttributes){
        System.out.println(productVO.toString());
        int result = productService.prodRegist(productVO); // 성공시 1, 실패시 0
        if(result == 1){
            redirectAttributes.addFlashAttribute("msg", "상품이 정상 등록 되었습니다.");
        }else{
            redirectAttributes.addFlashAttribute("msg", "상품 등록에 실패했습니다.");
        }
        return "redirect:/product/productList";
    }

    // 상품수정
    @PostMapping("/prodUpdate")
    public String prodUpdate(ProductVO productVO){
        int result = productService.prodUpdate(productVO); // 성공시 1, 실패시 0
        return "redirect:/product/productDetail?prodId=" + productVO.getProdId();
    }

    // 상품삭제
    @PostMapping("/prodDelete")
    public String prodDelete(@RequestParam("prodId") long prodId,
                             RedirectAttributes redirectAttributes){
        int result = productService.prodDelete(prodId);
        if(result == 1){
            redirectAttributes.addFlashAttribute("msg", "상품이 삭제되었습니다");
        }else{
            redirectAttributes.addFlashAttribute("msg", "상품 삭제를 실패했습니다");
        }

        return "redirect:/product/productList";
    }
}
