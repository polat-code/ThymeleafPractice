package com.example.thymeleafpractice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class WebController {
    @GetMapping("/index")
    public String indexPage() {
        return "index";
    }

}
