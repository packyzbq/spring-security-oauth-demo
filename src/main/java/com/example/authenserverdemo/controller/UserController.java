package com.example.authenserverdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * UserController
 *
 * @author Zhaobq
 * @version 1.0
 * @date 2020/12/18
 */
@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
    @GetMapping("/admin/hello")
    public String admin() {
        return "admin";
    }

    @GetMapping("/code")
    public String code(String code){
        return code;
    }
}
