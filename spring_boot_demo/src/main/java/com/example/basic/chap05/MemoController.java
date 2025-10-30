package com.example.basic.chap05;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/chap05")
public class MemoController {

    private final MemoServiceImpl memoService;

    public MemoController(MemoServiceImpl memoService) {
        this.memoService = memoService;
    }

    @GetMapping("/list")
    public String list(Model model){
        // 메모 데이터 리스트 가져옴
        List<MemoVO> list = memoService.list();
        model.addAttribute("list",list);
        return "/chap05/memoList";
    }
    @PostMapping("/memoRegister")
    public String memoRegister(MemoVO memoVO){
        memoService.memoRegister(memoVO);

        return "redirect:/chap05/list";
    }

    @GetMapping("/write")
    public String write(){
        return "/chap05/memoWrite";
    }
}
