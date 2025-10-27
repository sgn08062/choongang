package com.example.basic.chap01;

import com.example.basic.chap01.command.Quiz01VO;
import com.example.basic.chap01.command.ReqVO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@Controller // com.example.basic 패키지 아래에 있는 이 어노테이션이 붙어있는 파일들을 자동으로 객체로 생성해줌
@RequestMapping("/chap01")
public class RequestController {

    //@RequestMapping("/hello")
    @RequestMapping("/ex01")
    public String req_ex01(){
        System.out.println("컨트롤러 타고 나감!!");
        return "chap01/ex01";
    }

    // basic01 요청- 어노테이션에서 2개 이상의 속성을 사용하려면, 키를 붙여주면 된다
    // get 요청만 허용함
    //@RequestMapping(value ="/basic01", method = RequestMethod.GET)
    @GetMapping("/basic01")
    public String basic01(){
        System.out.println("basic01 메서드 동작함");
        return null;
    }

    // post 요청만 허용함
    //@RequestMapping(value = "basic02", method = RequestMethod.POST)
    @PostMapping("/basic02")
    public String basic02(){
        System.out.println("basic02 메서드 동작함");
        return null;
    }

    // 메서드 방식을 지정하지 않으면, 둘 다 허용시킴
    // 각 요청을 집합으로 묶어서 사용할 수 있음
//    @RequestMapping({"/basic01", "/basic02", "생략..."})
//    public void basic(){
//        System.out.println("basic01, 02 요청 처리");
//    }

    //----------------------------------------------------
    //@GetMapping("/ex02")
    //public void ex02(){}

    @GetMapping("/ex02")
    public String ex02(){
        return  "chap01/ex02";
    }

    @GetMapping("/redirect")
    public String redirect(){
        // 기본이동은 forward 방식을 이용하기 때문에 매핑주소(chap01/redirect)를 따라간다
        // redirect를 지정하면 해당 요청주소(/chap01/ex01)로 변경된다.
        System.out.println("리다이렉트 발동!!");
        return "redirect:/chap01/ex01"; // 컨트롤러를 거쳐간다.
    }

    @GetMapping("/redirect2")
    public String redirect2(){
        System.out.println("리바이렉트2 - 홈화면 전송");
        return "redirect:/";
    }

    // -----------------------------------------------------------
    // 파라미터 받기 1
//    @PostMapping("/param")
//    public String param(HttpServletRequest request){
//        String id = request.getParameter("id");
//        String password = request.getParameter("pw");
//        String name = request.getParameter("name");
//        String[] inter = request.getParameterValues("inter");
//        System.out.println(id+" "+ password+" "+name+" "+ Arrays.toString(inter));
//        return "chap01/ex02_ok"; // 결과화면
//    }

    // 파라미터 받기 2
    // RequestParam은 반드시 화면에서 데이터를 넘겨야 하는데, 넘기지 않더라도 허용하려면 required 옵션을 쓴다
    // defaultValue는 값이 넘어오지 않을 때 기본값을 지정
//    @PostMapping("/param")
//    public String param(@RequestParam("id") String id,
//                        @RequestParam("pw") String password,
//                        @RequestParam("name") String name,
//                        @RequestParam(value="inter", required = false, defaultValue = "기본값") String[] inter){
//
//        System.out.println(id+" "+ password+" "+name+" "+ Arrays.toString(inter));
//
//        return "chap01/ex02_ok"; // 결과화면
//    }

    // 파라미터 받기3 - VO 객체 사용
    @PostMapping("/param")
    public String param(ReqVO reqVO){

        System.out.println(reqVO.toString());

        return "chap01/ex02_ok"; // 결과화면
    }

    @GetMapping("/quiz01")
    public String quiz01(){
        return  "chap01/quiz01";
    }
    @PostMapping("/login")
    public String quiz01(Quiz01VO quiz01VO){
        if(!quiz01VO.getId().equals("abc123")){
            return "chap01/quiz01_no";
        }
        if(!quiz01VO.getPw().equals("xxx123")){
            return "chap01/quiz01_no";
        }
        return "chap01/quiz01_ok";
    }
}
