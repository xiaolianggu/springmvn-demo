package com.lagou.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
@RequestMapping("/auth")
public class AuthController {
    @RequestMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response, String username,String userpwd) {
        if("admin".equals(username)&&"admin".equals(userpwd)){
            request.getSession().setAttribute("user","admin:admin");
            return "redirect:toList";
        }
        return "redirect:toLogin";
    }

    @RequestMapping("/toLogin")
    public ModelAndView toLogin(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @RequestMapping("/toList")
    public ModelAndView toList(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("list");
        return modelAndView;
    }
}
