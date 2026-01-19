package com.example.revisionday1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RevisionHello {
    @GetMapping("/")
    public String greet(){
        return "hello harshit upadhyay!";
    }
    @GetMapping("/version")
    public String version(){
        return "this is version 1.O";
    }
//    @PostMapping("/form",)
}
