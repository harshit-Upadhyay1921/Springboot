package com.example.day2springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller           //use alone when need to return HTML pages
//@ResponseBody           //used with @Controller for returning plain text
public class Day2 {
//    @GetMapping("/")
//    public String home(){
//        return "index.html";     //plain text as annotator "ResponseBody" is there
//    }

    @GetMapping("/")
    public String landPage(){
        return "index";
    }
    @GetMapping("/Home")
    public String home(){
        return "home";
    }
    @GetMapping("/About")
    public String about(){
        return "about";
    }
    @GetMapping("/Contact")
    public String contact(){
        return "contact";
    }

}
