package com.example.basic.chap02;

import com.example.basic.chap01.command.ReqVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;

@Controller
@RequestMapping("/chap02")
public class ResponseController {
    @GetMapping("/ex01")
    public void ex01(){}

    @GetMapping("/ex02")
    public String ex02(Model model){
        //(키, 값)
        model.addAttribute("msg", "Hello World");
        model.addAttribute("date", new Date());
        model.addAttribute("name", "홍길동");

        return "chap02/ex02";
    }

    @GetMapping("/ex03")
    public ModelAndView ex03(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("chap02/ex03"); // 뷰의 정보 지정
        mv.addObject("msg", "Hello World");
        mv.addObject("date", new Date());
        mv.addObject("name", "홍길동");

        return mv;
    }

    @GetMapping("/ex04")
    public String ex04(@ModelAttribute("id") String id ){
        // id를 받아서 다음 화면에 id이름으로 데이터를 전달
        return "chap02/ex04";
    }

    @PostMapping("/ex05")
    public String ex05(@ModelAttribute("info") ReqVO reqVO){
        // 화면에서 넘어온 값은 vo에 맵핑하고 info라는 이름으로 다음 화면으로 전달
        return "chap02/ex05";
    }

    // 리다이렉트 어트리뷰트
    @GetMapping("/login")
    public String login(){
        return "chap02/login";
    }
    @PostMapping("/loginForm")
    public String loginForm(ReqVO reqVO, RedirectAttributes redirectAttributes){
        // id랑 pw가 같으면 로그인 성공
        String id = reqVO.getId();
        String pw = reqVO.getPw();
        if(id.equals(pw)){
            return "chap02/login_ok";
        }else{
            // 실패 시에는 메시지를 보내고 싶음 - 리다이렉트 시에는 데이터를 보낼 수 없다
            // BUT
            // 스프링에서는 리다이렉트 시에 1회성 데이터를 보내는 방법을 제공함
            redirectAttributes.addFlashAttribute("msg", "로그인에 실패했습니다.");
            return "redirect:/chap02/login";
        }
    }
}
