package org.example.springbootcourse.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //hello
    @RequestMapping("/hello")
    public String hello() {
        return "hello 2";
    }
}
