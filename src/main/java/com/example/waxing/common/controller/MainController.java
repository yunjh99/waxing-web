package com.example.waxing.common.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MainController {

    @GetMapping("/")
    public String main() { return "pages/home/index"; }

}
