package com.example.demo.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        System.out.print("123");
        model.addAttribute("name", name);
        return "/index";
    }
    @RequestMapping("/hello")
    public String test() {
        System.out.print("hello");
        return "hello";
    }
}
