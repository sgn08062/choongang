package com.example.basic.chap06;

import jakarta.servlet.http.HttpServletRequest;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.*;

//@Controller 완전히 다른 방식으로 동작함
@RestController // Controller + ResponseBody
@RequestMapping("/chap06")
public class RestBasicController {

    // @ResponseBody // 요청 온 곳으로 응답함. 자바의 object를 JSON형식으로 자동으로 변환
    @GetMapping("/basic")
    public String basic(){
        return "하이하이하이";
    }

    // 데이터를 응답하는 방법
    // 1. object
    @GetMapping("/getObject")
    public SimpleVO getObject(){
        SimpleVO simpleVO = new SimpleVO(1, "홍", "길동", LocalDateTime.now());

        return simpleVO;
    }

    // 2. map
    @GetMapping("/getMap")
    public Map<String, Object> getMap(){
        Map<String, Object> map = new HashMap<>();
        map.put("name", "홍길동");
        map.put("hobby", new String[] {"밥", "잠", "숨쉬기"});
        map.put("profile", new SimpleVO(1, "홍", "길동", LocalDateTime.now()));
        return map;
    }

    // 3. list
    @GetMapping("/getList")
    public List<SimpleVO> getList(){
        List<SimpleVO> list = new ArrayList<>();
        list.add(new SimpleVO(1, "홍", "길동", LocalDateTime.now()));
        list.add(new SimpleVO(2, "이", "순신", LocalDateTime.now()));
        list.add(new SimpleVO(3, "이", "성계", LocalDateTime.now()));
        return list;
    }

    // 데이터를 받는 방법
    // get주소를 통해서 받음 -> 쿼리스트림(?방식) or 쿼리파라미터(url주소방식)
    // post 바디에 데이터를 담아서 보냄 -> form형식 or json 형식
    //http://localhost:8181/chap06/getData?id=홍길동&age=20
    @GetMapping("/getData")
    public SimpleVO getData(@RequestParam("id") String id,
                            @RequestParam("age") int age){
        System.out.println(id + " " + age);
        return new SimpleVO(1, "홍", "길동", LocalDateTime.now());
    }

    @GetMapping("/getData2")
    public String getData2(SimpleVO simpleVO){
        System.out.println(simpleVO.toString());
        return "success";
    }

    //http://localhost:8181/chap06/getData3/이순신/30
    //@CrossOrigin("http://127.0.0.1:5501") // 이 주소에서 오는 요청은 허용하겠다
    @CrossOrigin("*")
    @GetMapping("/getData3/{name}/{age}")
    public String getData3(@PathVariable("name") String name,
                           @PathVariable("age") int age){
        System.out.println(name + age);
        return "success";
    }

    // post
    // 클라이언트에서 form 형식으로 데이터를 보낼 수 있음
    @PostMapping("/getForm")
    public String getForm(SimpleVO simpleVO){
        System.out.println(simpleVO.toString());
        return "success";
    }
    // 클라이언트에서 json 형식으로 데이터를 보낼 수 있음
    // @RequestBody는 JSON을 java Object로 맵핑
//    @PostMapping("/getJSON")
//    public String getJSON(@RequestBody SimpleVO simpleVO){
//        System.out.println(simpleVO.toString());
//        return "success";
//    }
    @CrossOrigin("http://127.0.0.1:5501")
    @PostMapping("/getJSON")
    public String getJSON(@RequestBody Map<String, Object> map){
        System.out.println(map.toString());
        return "success";
    }
    // 객체로 직접 받아서 매핑하는게 더 좋음


    // consumer - 반드시 데이터를 이 타입으로 보내!
    // producer - 이 타입의 데이터를 보내줄게
    @PostMapping(value = "/getResult", consumes = "application/json", produces = "text/html")
    public String getResult(@RequestBody String str){
        System.out.println(str);
        return "<h3>success</h3>";
    }

    // ResponseEntity<제네릭> - 응답문서 상세히 작성하기
    @PostMapping("/getEntity")
    public ResponseEntity<SimpleVO> getEntity(){ // < >안에 있는 데이터 형식이 header 객체

        // 데이터와 상태코드 반환
        SimpleVO simpleVO = new SimpleVO(1, "hong", "gildong", null);
//        ResponseEntity<SimpleVO> entity = new ResponseEntity<>(simpleVO, HttpStatus.FORBIDDEN);

        // 데이터와 헤더, 상태코드 반환
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("AccessControl-Allow-Origin", "*");
        headers.add("Authorization", "Bearer Token");
        ResponseEntity<SimpleVO> entity = new ResponseEntity<>(simpleVO, headers, HttpStatus.OK);
        return entity;
    }

    @CrossOrigin("http://127.0.0.1:5501")
    @GetMapping("/api/v1/getData")
    public SimpleVO getData4(@RequestParam("num") int num,
                           @RequestParam("name") String name){
        System.out.println(num + " " + name);
        return new SimpleVO(num, name.substring(0, 1), name.substring(1), LocalDateTime.now());
    }

    @CrossOrigin("http://127.0.0.1:5501")
    @PostMapping("/api/v1/getInfo")
    public ResponseEntity<List<SimpleVO>> getInfo(/*@RequestBody Map<String, Object> map*/
                                                @RequestParam("num") int num,
                                                @RequestParam("name") String name){
        List<SimpleVO> list = new ArrayList<>();

//        int num = (Integer) map.get("num");
//        String name = (String) map.get("name");
        SimpleVO vo = new SimpleVO(num, name.substring(0, 1), name.substring(1), LocalDateTime.now());
        num++;
        SimpleVO vo2 = new SimpleVO(num, name.substring(0,1), name.substring(1), LocalDateTime.now());

        list.add(vo);
        list.add(vo2);

        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(list, headers, HttpStatus.OK);
    }
}
