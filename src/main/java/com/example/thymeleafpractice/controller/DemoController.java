package com.example.thymeleafpractice.controller;

import com.example.thymeleafpractice.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
    @GetMapping("/")
    public String getIndex() {
        return "user-registration";
    }

    @RequestMapping(value = "/saveUser" , method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute User user) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-registration");
        modelAndView.setViewName("user-monitor");
        modelAndView.addObject("user",user);

        return  modelAndView;
    }
}
