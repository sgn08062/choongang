package com.sgn08062.spring_myweb.controller;

import com.sgn08062.spring_myweb.command.UserVO;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/login")
    public String loginPage(){
        return "user/login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        RedirectAttributes redirectAttributes,
                        HttpSession session){
        // DB에서 회원정보를 확인한 후에 로그인 처리
        // SELECT * FROM 유저테이블 WHERE ID=? AND PW=?
        // 반환타입은 UserVO 타입
        // UserVO가 null 이면 로그인 실패, userVO가 값이 있다면 로그인 성공
        System.out.println("로그인 정보 :"+username+", password: "+password);

        UserVO userVO = new UserVO("decoy", "1234");
        if(userVO != null){ // 로그인 성공
            session.setAttribute("userVO", userVO);
            return "redirect:/main";
        }else{ // 로그인 실패
            redirectAttributes.addFlashAttribute("msg", "아이디 비밀번호를 확인하세요");
            return "redirect:/user/login";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        // 세션에 저장된 userVO 삭제
        session.removeAttribute("userVO");
        return "redirect:/user/login";
    }


    @GetMapping("/join")
    public String joinPage(){
        return "user/join";
    }

    @GetMapping("/userDetail")
    public String userDetailPage(HttpSession session){
//        UserVO vo = (UserVO) session.getAttribute("userVO");
//        if(vo == null){// 로그인 안한사람
//            return  "redirect:/user/login";
//        }else{
//
//        }
        return "user/userDetail";
    }
}
