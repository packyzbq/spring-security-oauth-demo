package com.example.authenserverdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController
 *
 * @author Zhaobq
 * @version 1.0
 * @date 2020/12/17
 */
@RestController
public class TestController {

    @GetMapping("/admin/hello")
    public String admin(){
        return "admin";
    }
    @GetMapping("/user/hello")
    public String user(){
        return "user";
    }
    @GetMapping("/info")
    public String info(){
        return "info";
    }
}
