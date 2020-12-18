package com.example.authenserverdemo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * OauthController
 *
 * @author Zhaobq
 * @version 1.0
 * @date 2020/12/18
 */
@RestController
public class OauthController {

    @PostMapping(value = "/login")
    public String login(@RequestParam String username, @RequestParam String password){
        return null;
    }
}
