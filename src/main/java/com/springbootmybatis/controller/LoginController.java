package com.springbootmybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @RequestMapping("/employee/login")
    public String login(@RequestParam("username") String username, @RequestParam("password")
            String password, Model model, HttpSession httpSession){
        if(!StringUtils.isEmpty(username) && password.equals("123456")){
            httpSession.setAttribute("loginUser",username);
            return "redirect:/main.html"; //可以将请求参数隐藏起来，避免数据泄露
        }else{
           model.addAttribute("msg","用户名或密码错误");
           return "index";
        }

    }
}
