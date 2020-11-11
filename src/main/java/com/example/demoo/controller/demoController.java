package com.example.demoo.controller;

import com.example.demoo.enter.userEnter;
import com.example.demoo.server.serverInf.userSververInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class demoController {

    @Autowired
    userSververInf userSverver;

    @RequestMapping("/index")
    public String sayHello(userEnter user) {
        System.out.println("bbbbbb"+user.getName()+"---------"+user.getPassWord());
        userSverver.uServer();

        return "index";
    }

}
