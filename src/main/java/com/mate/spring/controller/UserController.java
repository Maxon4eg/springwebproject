package com.mate.spring.controller;

import com.mate.spring.model.User;
import com.mate.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    @Qualifier("userService1")
    private UserService userService;

    @RequestMapping("/login")
    public ModelAndView loginGet() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("user", new User());
        mv.setViewName("login");
        return mv;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView loginPost(@RequestParam("user") User user) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("user", new User());
        mv.setViewName("welcome");
        return mv;
    }
}
