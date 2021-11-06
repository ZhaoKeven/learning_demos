package com.example.springsecuritydemo.controller;

import com.example.springsecuritydemo.model.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LoginController {

    @GetMapping("/login")
    public String login(UserEntity user) {
        if (StringUtils.isEmpty(user.getUsername()) || StringUtils.isEmpty(user.getPassword())) {
            return "请输入用户名和密码！";
        }

        return "login success";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin success!";
    }

    @GetMapping("/index")
    public String index() {
        return "index success!";
    }

    @GetMapping("/add")
    public String add() {
        return "add success!";
    }

    @GetMapping("/delete")
    public String delete() {
        return "delete success!";
    }

    @GetMapping("/update")
    public String update() {
        return "update success!";
    }
}
