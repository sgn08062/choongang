package com.example.basic.quiz;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/quiz")
public class Quiz01Controller {
    // 회원가입 화면 진입
    @GetMapping("/quiz01")
    public void quiz01(){}

    @PostMapping("/join")
    public String quiz01(HttpServletRequest request, Model model, RedirectAttributes redirectAttributes) {
        String id = request.getParameter("id");
        String pw = request.getParameter("pw");
        String email = request.getParameter("email");
        String agree = request.getParameter("agree");

        if(id.equals("") || pw.equals("") || email.equals("")){
            redirectAttributes.addFlashAttribute("msg1", "양식을 채워주세요");
            return "redirect:/quiz/quiz01";
        }
        if(!agree.equals("y")){
            redirectAttributes.addFlashAttribute("msg2", "개인정보 이용에 동의해주세요");
            return "redirect:/quiz/quiz01";
        }

        model.addAttribute("id", id);
        model.addAttribute("pw", pw);
        model.addAttribute("email", email);
        model.addAttribute("agree", agree);

        return "quiz/quiz01_ok";
    }

    @GetMapping("/terms")
    public String terms(Model model) {
        String termsContent = "제1조 (목적)\n" +
                "이 약관은 서비스 이용에 관한 사항을 규정함을 목적으로 합니다.\n\n" +
                "제2조 (정의)\n" +
                "이 약관에서 사용하는 용어의 정의는 다음과 같습니다.\n" +
                "1. '서비스'란 회사가 제공하는 모든 서비스를 의미합니다.\n" +
                "2. '이용자'란 서비스를 이용하는 자를 의미합니다.\n\n" +
                "제3조 (약관의 효력)\n" +
                "이 약관은 이용자가 동의함으로써 효력을 발생합니다.";
        model.addAttribute("termsContent", termsContent);

        return "/quiz/terms";
    }

    @PostMapping("/terms_prog")
    public String terms_prog(HttpServletRequest request, RedirectAttributes redirectAttributes, Model model) {
        String agreement = request.getParameter("agreement");
        if(agreement==null || !agreement.equals("y")){
            redirectAttributes.addFlashAttribute("agree", "이용약관에 동의하세요");
            return "redirect:/quiz/terms";
        }

        model.addAttribute("phoneNumber",  request.getParameter("phoneNumber"));
        return "quiz/quiz01_ok";
    }
}
