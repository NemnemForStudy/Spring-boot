package com.nemnem.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping
    public String index() {
        // index.html 파일이니 return을 string 형식으로 해주자.
        return "index";
    }
}
