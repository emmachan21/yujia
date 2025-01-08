package com.happy.smile.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class restController {

    @RequestMapping("list")
    public String list() {
        return "Hello World";
    }

}
