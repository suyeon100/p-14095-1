package com.mysite.sbb;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/")
    @ResponseBody
    public String index() {
        System.out.println("index() 메서드 호출됨!");
        return "안녕하세요 SBB에 오신 것을 환영합니다.";
    }

    @GetMapping("/hello")
    public void hello() {
        System.out.println("hello() 메서드 호출됨!");
    }
}