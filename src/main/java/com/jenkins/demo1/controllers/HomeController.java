package com.jenkins.demo1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping
    String getHome(Model model){
        model.addAttribute("something", "Hi it is home controller !!");
        return "home";
    }
}
