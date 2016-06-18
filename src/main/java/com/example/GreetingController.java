package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {
    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "Hijiri");
        return "greeting";
    }
}
