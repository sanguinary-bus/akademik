package com.prodemy.gen16.akademik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController {

    @GetMapping
    public String index() {
        return "index";
    }

    @PostMapping("/further-info")
    public String furtherInfo() {
        return "further-info";
    }

    @GetMapping("/fail")
    public String fail() {
        throw new RuntimeException("Failed!");
    }
}
