package com.example.demo.controller;

import com.example.demo.command.UserVO;
import com.example.demo.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    // 시큐리티가 적용되면 모든 요청에 대해서 시큐리티가 제공하는 기본 로그인 화면이 보여지게 된다.
    // 기본 아이디는 user, 패스워드는 로그에 있습니다.
    // 로그아웃의 기본경로는 /logout 이다
    // 로그아웃 이후에는 /hello 페이지로 진입이 불가능하다.
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/all")
    public String all(){
        return "all";
    }

    @GetMapping("/join")
    public String join(){
        return "join";
    }

    @PostMapping("/joinForm")
    public String joinForm(UserVO userVO){
        System.out.println(userVO.toString());
        String pw = bCryptPasswordEncoder.encode(userVO.getPassword());
        userVO.setPassword(pw);

        userMapper.join(userVO);

        return "redirect:/login";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
