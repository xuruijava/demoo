package com.example.demoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class demoController {
    @RequestMapping("/index")
    public String sayHello() {

        return "index";
    }

    }
