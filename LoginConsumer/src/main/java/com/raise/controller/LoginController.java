package com.raise.controller;

import com.raise.service.LoginService;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import param.UserParam;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginService loginService;
    @ResponseBody
    @RequestMapping("/info")
    public String login(){
        return loginService.Login();
    }

    @ResponseBody
    @RequestMapping("/user")
    public User getUser(UserParam param){
        return loginService.getUser(param);
    }

    @ResponseBody
    @RequestMapping("/user2")
    public User getUser2(String loginName, String password){
        return loginService.getUser2(loginName, password);
    }

    @ResponseBody
    @RequestMapping("/user3/{loginName}/{password}")
    public User getUser3(@PathVariable String loginName, @PathVariable String password){
        return loginService.getUser2(loginName, password);
    }
}
