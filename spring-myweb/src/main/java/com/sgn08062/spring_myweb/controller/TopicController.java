package com.sgn08062.spring_myweb.controller;

import com.sgn08062.spring_myweb.command.TopicVO;
import com.sgn08062.spring_myweb.topic.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public void topicDetail(){}
    @GetMapping("/topicListAll")
    public void topicListAll(){}
    @GetMapping("/topicListMe")
    public void topicListMe(){}
}
