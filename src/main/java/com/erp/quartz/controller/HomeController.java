package com.erp.quartz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {

        return "index";
    }
}
