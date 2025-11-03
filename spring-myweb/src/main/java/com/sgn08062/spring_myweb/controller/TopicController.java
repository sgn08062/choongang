package com.sgn08062.spring_myweb.controller;

import com.sgn08062.spring_myweb.command.TopicVO;
import com.sgn08062.spring_myweb.topic.TopicService;
import oracle.jdbc.proxy.annotation.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/topic")
public class TopicController {
    @Autowired
    @Qualifier("TopicService")
    TopicService topicService;

    @GetMapping("/topicReg")
    public void topicReg(){}
    @PostMapping("/topicRegister")
    public String topicRegister(TopicVO topicVO){
        System.out.println(topicVO.toString());
        topicService.topicRegist(topicVO);

        return "redirect:/topic/topicListAll";
    }
    @GetMapping("/topicDetail")
    public String topicDetail(@RequestParam("topicId") long topicId, Model model){
        model.addAttribute("vo",topicService.topicDetail(topicId));
        return "/topic/topicDetail";
    }
    @GetMapping("/topicListAll")
    public String topicListAll(Model model){
        model.addAttribute("topicListAll", topicService.topicListAll());
        return "/topic/topicListAll";
    }
    @GetMapping("/topicListMe")
    public String topicListMe(Model model){
        String topicWriter = "decoy";
        List<TopicVO> topicList = topicService.topicListMe(topicWriter);
        model.addAttribute("topicListMe", topicList);

        return "/topic/topicListMe";
    }

    @GetMapping("/topicModify")
    public String topicModify(@RequestParam("topicId") long topicId, Model model){
        TopicVO vo = topicService.topicDetail(topicId);
        model.addAttribute("vo", vo);
        return "/topic/topicModify";
    }

    @PostMapping("/topicModify")
    public String topicMod(TopicVO topic){
        topicService.topicModify(topic);
        return "redirect:/topic/topicListMe";
    }

    @PostMapping("/topicDelete")
    public String topicDelete(TopicVO vo){
        topicService.topicDelete(vo);
        return "redirect:/topic/topicListMe";
    }
}
